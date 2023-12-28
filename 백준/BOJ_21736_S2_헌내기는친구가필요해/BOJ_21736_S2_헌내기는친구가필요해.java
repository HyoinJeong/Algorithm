import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_21736_S2_헌내기는친구가필요해 {

	public static int N;
	public static int M;
	public static char[][] map;
	public static int[] startXY;
	public static int result;
	public static int[] dx = {1,-1,0,0};
	public static int[] dy = {0,0,1,-1};

	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new char[N][M];
		startXY = new int[2];
		
		for(int i=0; i<N; i++) {
			map[i] = br.readLine().toCharArray();
			for(int j=0; j<M; j++) {
				if(map[i][j]=='I') {
					startXY[0] = i;
					startXY[1] = j;
				}
			}
		}
		
		bfs();
		
		if(result!=0) {
			System.out.println(result);
		}
		else {
			System.out.println("TT");
		}

	}
	
	public static void bfs() {
		Queue<int[]> queue = new ArrayDeque<>();
		boolean[][] isVisited = new boolean[N][M];
		queue.add(startXY);
		isVisited[startXY[0]][startXY[1]] = true;
		
		while(!queue.isEmpty()) {
			int[] curXY = queue.poll();
			
			for(int i=0; i<4; i++) {
				int nx = curXY[0] + dx[i];
				int ny = curXY[1] + dy[i];

				if(nx>=0&&nx<N&&ny>=0&&ny<M) {
					if(!isVisited[nx][ny]) {
						if(map[nx][ny] == 'O') {
							queue.offer(new int[] {nx,ny});
							isVisited[nx][ny] = true;
						}
						else if(map[nx][ny] == 'P') {
							result++;
							queue.offer(new int[] {nx,ny});
							isVisited[nx][ny] = true;
						}
					}
				}
			}
		}
	}

}
