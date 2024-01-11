package baekJoon_05;

import java.util.Scanner;

public class _09_baek2908 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 값 입력
		String A = Integer.toString(sc.nextInt());
		String B = Integer.toString(sc.nextInt());
		//StringBuilder 선언
		StringBuilder reverseA = new StringBuilder(A);
		StringBuilder reverseB = new StringBuilder(B);
		// 리버스 값 저장
		A = reverseA.reverse().toString();
		B = reverseB.reverse().toString();
	
		// 값 비교 후 출력
		if(Integer.parseInt(A) >= Integer.parseInt(B)) {
			System.out.println(A);
		} else {
			System.out.println(B);
		}
			
		sc.close();		
	}
}
