package baekJoon_04;

import java.util.Scanner;

public class _06_baek10813 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int[] bucket = new int[N];
		int change = 0;
		
		// 바구니에 공 번호 넣기
		for(int reset = 0 ; reset < N; reset++) {
			bucket[reset] = reset+1;
		}
		
		for(int count = 0 ; count < M ; count++) {
			// 공 넣는 방법 입력
			int i = sc.nextInt();
			int j = sc.nextInt();
			
			// 공 바꾸기
			change = bucket[i-1];
			bucket[i-1] = bucket[j-1];
			bucket[j-1] = change;
		}
		sc.close();
		
		// 출력
		for(int print = 0; print < N; print++) {
			System.out.print(bucket[print] + " ");
		}
				
	}

}
