package baekJoon_05;

import java.util.Scanner;

public class _07_baek2675 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	// 테스트 횟수

		for(int i = 0 ; i < T ; i++) {
			int R = sc.nextInt();	// 반복 출력 횟수 입력
			String S = sc.next();	// 문자열 S 입력
			for(int j = 0 ; j < S.length() ; j++) {	// 각 자리수마다
				for(int k = 0 ; k < R; k++) {		// R 횟수만큼 출력하기
					System.out.print(S.charAt(j));
				}
			}
			System.out.println();
		}
		
		sc.close();		
	}
}
