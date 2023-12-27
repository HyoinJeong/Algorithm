import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class BOJ_1544_S4_사이클단어2 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		HashSet<String> set = new HashSet<>();
		int result = 0;
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			
			if(set.contains(str)) {
				continue;
			}
			
			StringBuffer sb = new StringBuffer(str);
			for(int j=0; j<str.length(); j++) {
				sb.append(str.charAt(j));
				sb.deleteCharAt(0);
				String subStr = sb.toString();
				set.add(subStr);
			}
			
			result++;
		}
		
		System.out.println(result);
	}
}
