package baekJoon_04;

import java.util.Scanner;

public class _08_baek3052 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] A = new int[42];	// 나머지값 저장
		int result = 0;
		
		for(int i = 0 ; i < 42; i++) {
			A[i] = 0;
		}
		for (int i = 0 ; i < 10; i++) {
			A[sc.nextInt() % 42]++;
		}
		sc.close();
		
		// 배열에 나머지값 카운트가 올라가있는 칸 발견 시 결과값 증가
		for(int i = 0 ; i < 42; i++) {
			if(A[i] != 0) {
				result++;
			}
		}
		System.out.println(result);
	}
}
