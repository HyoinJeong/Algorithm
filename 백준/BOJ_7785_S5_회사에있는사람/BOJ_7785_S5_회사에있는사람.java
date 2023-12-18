import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class BOJ_7785_S5_회사에있는사람 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		int n = Integer.parseInt(st.nextToken());
		
		TreeSet<String> set = new TreeSet<>();
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			String name = st.nextToken();
			String state = st.nextToken();
			
			if(state.equals("leave") && set.contains(name)) {
				set.remove(name);
			}
			else if(state.equals("enter") && !set.contains(name)) {
				set.add(name);
			}
		}
		
		Iterator<String> it = set.descendingIterator();
		
		while(it.hasNext()) {
			sb.append(it.next()).append("\n");
		}
		
		System.out.println(sb.toString());
		
	}
}
