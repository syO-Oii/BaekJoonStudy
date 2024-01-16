package baekJoon_07;

import java.util.Scanner;

public class _02_baek2566 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num[][] = new int[9][9];
		int max = 0;
		int arrayX = 0;
		int arrayY = 0;
		
		for(int i = 0; i < 9 ; i++) {
			for(int j = 0 ; j < 9; j++) {
				num[i][j] = sc.nextInt();
			}
		}
		
		
		for(int i = 0; i < 9 ; i++) {
			for(int j = 0 ; j < 9; j++) {
				if(num[i][j] > max) {
					max = num[i][j];
					arrayX = i;
					arrayY = j;
				}
			}
		}
		
		System.out.println(max);
		System.out.println((arrayX+1) + " " + (arrayY+1));
		sc.close();
	}
}
