package baekJoon_04;

import java.util.Scanner;

public class _01_baek10807 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();	// 정수의 개수 입력받음
		int[] intArrays = new int[N];	// N칸의 배열 생성
		
		for(int i = 0; i < N; i++) {
			intArrays[i] = sc.nextInt();	// intArrays에 입력값 저장
		}
		
		int v = sc.nextInt();	// 찾으려는 정수 v값 생성
		
		int count = 0;
		
		for(int j = 0; j < N; j++) {
			if(v == intArrays[j]) {
				count++;
			}
		}
		System.out.println(count);
		sc.close();
		
	}
}
