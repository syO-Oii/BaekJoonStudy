package baekJoon_07;

import java.util.Scanner;

public class _03_baek10798 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[][] word = new char[5][15];
		
		// 값 입력
		for(int i = 0 ; i < 5; i++) {
			String insertWord = sc.nextLine();
			for(int j = 0 ; j < insertWord.length(); j++) {
				word[i][j] = insertWord.charAt(j);
			}
		}
		
		// 값 출력
		for(int i = 0 ; i < 15; i++) {
			for(int j = 0 ; j < 5; j++) {
				if(word[j][i] != 0) {
					System.out.print(word[j][i]);		// 값이 공백이 아니면 출력			
				}				
			}
		}
		sc.close();
	}
}
