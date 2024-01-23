package baekJoon_08;

import java.util.Scanner;

/*
 * 1단계 = 1개  1
 * 2단계 = 6개  2~7
 * 3단계 = 12개 8~19
 * 4단계 = 18개 20~37
 * 5단계 = 24개 38 ~ 61
 * ... n단계 = (n-1) * 6개
 *  */




public class _05_baek2292 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int count = 0;
		int result = 1;
		boolean success = false;
		
		while(!success) {
			++count;
			if(N <= result) {
				System.out.println(count);
				success = true;
			} else {
				result += count * 6;
			}
		}
		
	}
}
