package baekJoon_04;

import java.util.Scanner;

public class _05_baek10810 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] bucket = new int[N];
		int[] ball = new int[N];
		
		// 바구니 비우기 + 각 공마다 번호 쓰기
		for(int reset = 0 ; reset < N; reset++) {
			bucket[reset] = 0;
			ball[reset] = reset+1;
		}
		
		// i, j, k 값을 각각 입력받고 공넣기
		for(int count = 0 ; count < M ; count++) {
			int i = sc.nextInt();
			int j = sc.nextInt();
			int k = sc.nextInt();
			
			// i번 바구니 ~ j번 바구니에 k값 넣기
			for(int startBNum = i-1 ; startBNum < j; startBNum++) {
				bucket[startBNum] = ball[k-1];
			}
			
		}
		sc.close();
		
		// 출력
		for(int print = 0; print < N; print++) {
			System.out.print(bucket[print] + " ");
		}
				
	}

}