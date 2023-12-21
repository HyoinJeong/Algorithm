import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_9996_S3_한국이그리울땐서버에접속하자 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		
		int N = Integer.parseInt(br.readLine());
		String patterStr = br.readLine();
		String[] pattern = patterStr.split("\\*");
		
		for(int i=0; i<N; i++) {
			String str = br.readLine();
			
			if(patterStr.length()-1 > str.length()) {
				sb.append("NE").append("\n");
				continue;
			}
			
			String front = str.substring(0, pattern[0].length());
			String back = str.substring(str.length()-pattern[1].length(), str.length());
			
			if(front.equals(pattern[0]) && back.equals(pattern[1])) {
				sb.append("DA").append("\n");
			}
			else {
				sb.append("NE").append("\n");
			}
		}
		
		System.out.println(sb.toString());
	}
}
