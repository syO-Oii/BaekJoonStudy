package baekJoon_04;

import java.util.Scanner;

public class _03_baek10818 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] intArray = new int[N];
		int min;
		int max;
		
		
		for(int i = 0; i < N; i++) {
			intArray[i] = sc.nextInt();
		}
		sc.close();
		min = intArray[0];
		max = intArray[0];
		
		for(int j = 0; j < N; j++) {
			if(min > intArray[j]) {
				min = intArray[j];
			}
			if(max < intArray[j]) {
				max = intArray[j];
			}
		}
		
		System.out.print(min + " " + max);
		
	}
}
