import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BOJ_1544_S4_사이클단어 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		List<String> list = new ArrayList<>();
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			boolean isSame = false;
			
			compare:
			for(int j=0; j<list.size(); j++) {
				String curStr = list.get(j);
				if(curStr.length()/2 != str.length()) {
					continue;
				}
				
				for(int k=0; k<curStr.length()/2; k++) {
					String subStr = curStr.substring(k, k+curStr.length()/2);
					if(str.equals(subStr)) {
						isSame = true;
						break compare;
					}
				}
			}
			
			if(!isSame) {
				String reStr = str.concat(str);
				list.add(reStr);
			}
		}
		
		System.out.println(list.size());
	}
}
