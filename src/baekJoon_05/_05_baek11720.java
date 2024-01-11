package baekJoon_05;

import java.util.Scanner;

public class _05_baek11720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//숫자의 갯수 입력
		int N = sc.nextInt();
		
		// 숫자 N개 문자열로 저장
		String numbers = sc.next();
		int sum = 0;
		
		// 합계 구하기
		for(int i = 0 ; i < N ; i++) {
			sum += Character.getNumericValue(numbers.charAt(i));
		}
		
		System.out.println(sum);
		sc.close();
	}

}
