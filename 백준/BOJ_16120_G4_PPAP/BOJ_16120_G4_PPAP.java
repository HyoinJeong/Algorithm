package algo2024;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ_16120_G4_PPAP {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String input = br.readLine();
		Stack<Character> stack = new Stack<>();
		
		for(int i=0; i<input.length(); i++) {
			if(input.charAt(i) == 'P') {
				stack.push('P');
			}
			else {
				if(stack.size()>=2 && i<input.length()-1 && input.charAt(i+1)=='P') {
					stack.pop();
					stack.pop();
				}
				else {
					System.out.println("NP");
					return;
				}
			}
		}
		
		if(stack.size()==1) {
			System.out.println("PPAP");
		}
		else {
			System.out.println("NP");
		}
	}

}
