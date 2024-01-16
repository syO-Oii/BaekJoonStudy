package baekJoon_07;

import java.util.Scanner;

public class _04_baek2563 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = Integer.parseInt(sc.nextLine());
		int[][] whitePaper = new int[100][100];
		
		// 도화지에 색종이 위치를 받아서 넓이 표시
		for(int i = 0 ; i < count; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			placePaper(whitePaper, x, y);
		}
		
		// 도화지에 표시된 검은 영역의 넓이 계산
		int blackArea = calculateBlackArea(whitePaper);
		System.out.println(blackArea);
		sc.close();
	}
	
	private static void placePaper(int[][] whitePaper, int x, int y) {
		for(int i = x; i < x + 10; i++) {
			for(int j = y; j < y + 10; j++) {
				whitePaper[i][j] = 1;
			}
		}
	}
	
	private static int calculateBlackArea(int[][] whitePaper) {
		int blackArea = 0;
		for(int i = 0 ; i < 100 ; i++) {
			for(int j = 0; j < 100; j++) {
				if(whitePaper[i][j] == 1) {
					blackArea++;
				}
			}
		}
		return blackArea;
	}
}
