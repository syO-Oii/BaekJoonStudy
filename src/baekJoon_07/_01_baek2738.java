package baekJoon_07;

import java.util.Scanner;

public class _01_baek2738 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[][] result = new int[N][M];
		
		// 결과 값 초기화
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0; j < M ; j++) {
				result[i][j] = 0;
			}
		}
		
		// 배열 2개 값 각각 계산
		for(int a = 0 ; a < 2 ; a++){
			for(int i = 0 ; i < N ; i++) {
				for(int j = 0; j < M ; j++) {
					result[i][j] += sc.nextInt();
				}
			}
		}
	
		// 결과물 출력
		for(int i = 0 ; i < N ; i++) {
			for(int j = 0; j < M ; j++) {
				System.out.print(result[i][j] + " ");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
