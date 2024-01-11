package baekJoon_04;

import java.util.Scanner;

public class _09_baek10811 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	// 바구니 갯수
		int M = sc.nextInt();	// 몇번 바꿀건지
		int[] bucket = new int[N+1];
		int i;	// 몇번째부터
		int j;	// 몇번째 까지
		int change = 0;
		
		for(int k = 1 ; k <= N ; k++) {
			bucket[k] = k;
		}		
		
		for(int k = 0 ; k < M; k++) {
			i = sc.nextInt();
			j = sc.nextInt();
			
			for(int l = 0 ; l < (j - i + 1) / 2; l++) {
				change = bucket[i+l];
				bucket[i+l] = bucket[j-l];
				bucket[j-l] = change;
			}
		}
		sc.close();
		
		for(int k = 1; k <= N; k++) {
			System.out.print(bucket[k] + " ");
		}
		
		
	}
}
