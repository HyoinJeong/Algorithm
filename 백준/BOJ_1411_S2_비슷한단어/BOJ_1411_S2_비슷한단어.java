import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ_1411_S2_비슷한단어 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		String[] input = new String[N];
		
		for(int i=0; i<N; i++) {
			input[i] = br.readLine();
		}
		
		int result = 0;
		for(int i=0; i<N; i++) {
			char[] str1 = input[i].toCharArray();

			for(int j=i+1; j<N; j++) {
				char[] isChange = new char[26]; // 비교 고정 문자열의 알파벳이 바꼈을 때 저장
				boolean[] isUsed = new boolean[26]; // 해당 알파벳이 쓰이고 있는지 여부
				boolean isOk = true;
				char[] str2 = input[j].toCharArray();
				for(int k=0; k<str1.length; k++) {
					if(isChange[str1[k]-'a'] =='\u0000') { // 문자를 바꾼적 없을 때
						if(isUsed[str2[k]-'a']) { // 이미 해당 문자열을 사용하고 있으므로 패스
							isOk = false;
							break;
						}
						else {
							isChange[str1[k]-'a'] = str2[k];
							isUsed[str2[k]-'a'] = true;
						}
					}
					else {
						if(isChange[str1[k]-'a'] != str2[k]) {
							isOk = false;
							break;
						}
					}
				}
				if(isOk) {
					result++;
				}
			}
		}
		
		System.out.println(result);

	}

}
