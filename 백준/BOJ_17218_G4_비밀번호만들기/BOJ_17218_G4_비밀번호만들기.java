package algo2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BOJ_17218_G4_비밀번호만들기 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s1 = br.readLine();
		String s2 = br.readLine();

		int[][] lcs = new int[s1.length() + 1][s2.length() + 1]; // lcs 길이
		String[][] lcsString = new String[s1.length() + 1][s2.length() + 1]; // lcs 문자열

		// string배열은 초기화 직접 해줘야함
		for (int i = 0; i <= s1.length(); i++) {
			lcsString[i][0] = "";
		}

		for (int i = 0; i <= s2.length(); i++) {
			lcsString[0][i] = "";
		}

		for (int i = 1; i <= s1.length(); i++) {
			for (int j = 1; j <= s2.length(); j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
					lcs[i][j] = lcs[i - 1][j - 1] + 1;
					lcsString[i][j] = lcsString[i - 1][j - 1].concat(Character.toString(s1.charAt(i - 1)));
				} else {
					lcs[i][j] = Math.max(lcs[i - 1][j], lcs[i][j - 1]);
					if (lcsString[i - 1][j].length() > lcsString[i][j - 1].length()) {
						lcsString[i][j] = lcsString[i - 1][j];
					} else {
						lcsString[i][j] = lcsString[i][j - 1];
					}
				}
			}
		}

		System.out.println(lcsString[s1.length()][s2.length()]);
	}

}
