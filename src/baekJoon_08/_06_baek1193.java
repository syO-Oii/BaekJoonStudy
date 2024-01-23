package baekJoon_08;

import java.util.Scanner;

/*
 *  1 	  1 1/1 
 *  2~3   2 1/2 2/1
 *  4~6   3 3/1 2/2 1/3
 *  7~10  4 1/4 2/3 3/2 4/1
 *  11~15 5 5/1 4/2 3/3 2/4 1/5
 *  ...
 *  
 * */

public class _06_baek1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.close();
		System.out.println(findLocation(N));
	}
	
	private static String findLocation(int N) {
		int count = 1;	// 대각선 라인
		while(N > count) {
			N -= count;
			count++;
		}
		
		int numerator;			// 분자
		int denominator; 		// 분모
		
		
		if(count % 2 == 0) {	// 대각선 라인 = 짝수 
			numerator = N;		
			denominator = (count - N) + 1;
		} else {				// 대각선 라인 = 홀수
			numerator = (count - N) + 1;
			denominator = N;
		}
		
		return numerator + "/" + denominator;
	}
}
