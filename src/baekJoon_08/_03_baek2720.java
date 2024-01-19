package baekJoon_08;

import java.util.Scanner;

public class _03_baek2720 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int T = sc.nextInt();	// 테스트 케이스
		int change = 0; 	//거스름돈
		int[][] changeCount = new int[T][4];
		int[] moneyUnit = {25, 10, 5, 1};
		
		for(int i = 0 ; i < T ; i++) {
			int C = sc.nextInt();
			change = C;
			for(int j = 0; j < 4; j++) {
				changeCount[i][j] = change / moneyUnit[j];		// 각 단위로 나눈 몫을 저장
				change = change - (changeCount[i][j] * moneyUnit[j]);	// 남은 잔액 계산
				
			}			
		}
		
		for(int i = 0 ; i < T ; i++) {
			for(int j = 0 ; j < 4 ; j++) {
				System.out.print(changeCount[i][j] + " ");
			}
			System.out.println();
		}
			
		sc.close();
	}
}
