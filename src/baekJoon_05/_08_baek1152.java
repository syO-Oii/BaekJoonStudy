package baekJoon_05;

import java.util.Scanner;

public class _08_baek1152 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String test = sc.nextLine();
		int count = 1;	// 문자가 입력 될 경우 최소 문장 수 = 1개
		
		test = test.trim();	// 맨 앞과 뒤의 공백 제거
		
		// 문자 미입력 시 0 출력
		if(test.isEmpty()) {
			System.out.println("0");
			sc.close();
			return;
		}
		
		//문자열을 공백으로 나눈 후 단어의 갯수를 count에 추가
		for(int i = 0 ; i < test.length(); i++) {
			if(test.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
	}
}
