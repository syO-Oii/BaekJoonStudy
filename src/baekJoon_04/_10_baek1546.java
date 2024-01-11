package baekJoon_04;

import java.util.Scanner;

public class _10_baek1546 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();			// 과목 수
		float[] score = new float[N];	// 각 과목 점수
		int max = 0;					// 최대값
		float result = 0;				//결과값
		
		for(int i = 0 ; i < N; i++) {
			score[i] = sc.nextInt();	// 과목 점수 입력
			if(max < score[i]) {
				max = (int) score[i];	// 최대값 비교 후 max에 최대값 입력
			}
		}
		
		for(int i = 0 ; i < N ; i++) {
			result += score[i] / max * 100;		// result에 계산식 작성
		}
				
		sc.close();
		System.out.println(result / N);			// 계산식 합 / 전체 과목으로 계산 후 출력
		
	}
}
