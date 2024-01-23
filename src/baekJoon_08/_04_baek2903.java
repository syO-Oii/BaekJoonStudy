package baekJoon_08;

import java.util.Scanner;

public class _04_baek2903 {
	public static void main(String[] args) {
		/*
		 * i = 1, 점 = 4 ; 2^2
		 * i = 2, 점 = 9 ; 3^2
		 * i = 3, 점 = 25; 5^2
		 * i = 4, 점 = 81; 9^2
		 * i = 5, 점 = 289; 17^2
		 * i = 6, 점 = 1089; 33^2
		 * 제곱수 = 직전값 i + (i - 1)의 제곱
		 */
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int num = 2;
		for(int i = 1; i <= N; i++) {
			num = num + (num-1);
		}
		
		System.out.println(num * num);
		sc.close();
	}
}
