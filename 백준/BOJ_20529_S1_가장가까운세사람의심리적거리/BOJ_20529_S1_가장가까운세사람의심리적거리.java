import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ_20529_S1_가장가까운세사람의심리적거리 {

	public static void main(String[] args) throws Exception {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(in.readLine());
		StringBuffer sb = new StringBuffer();

		int T = Integer.parseInt(st.nextToken());

		for (int tc = 0; tc < T; tc++) {
			st = new StringTokenizer(in.readLine());
			int N = Integer.parseInt(st.nextToken());

			st = new StringTokenizer(in.readLine());
			String[] person = new String[N];
			for (int i = 0; i < N; i++) {
				person[i] = st.nextToken();
			}

			int result = Integer.MAX_VALUE;

			out:
			for (int i = 0; i < N; i++) {
				for (int j = i + 1; j < N; j++) {
					for (int k = j + 1; k < N; k++) {
						int curDist = calDistance(person[i], person[j], person[k]);
						if(curDist == 0) {
							result = 0;
							break out;
						}
						result = Math.min(result, curDist);

					}
				}
			}

			sb.append(result).append("\n");
		}

		System.out.println(sb.toString());
	}

	public static int calDistance(String mbti1, String mbti2, String mbti3) {
		return distance(mbti1, mbti2) + distance(mbti1, mbti3) + distance(mbti2, mbti3);
	}

	public static int distance(String s1, String s2) {
		int dist = 0;
		for (int i = 0; i < 4; i++) {
			if (s1.charAt(i) != s2.charAt(i)) {
				dist++;
			}
		}
		return dist;
	}

}
