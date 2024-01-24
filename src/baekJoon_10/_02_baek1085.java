package baekJoon_10;

import java.util.Scanner;

public class _02_baek1085 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int w = sc.nextInt();	// width, 넓이
		int h = sc.nextInt();	// height, 높이
		sc.close();
		int upperSide = h - y;
		int rightSide = w - x;
		
		// 각 면에 가까운 값 도출 방법
		// 아래 가로면 : y
		// 윗 가로면 : h - y => upperSide
		// 왼쪽 세로 : x
		// 오른쪽 세로 : w - x => rightSide
		
		
		if(y <= x && y <= upperSide && y <= rightSide) {							// 아래 면이 가까울 때
			System.out.println(y);
		} else if(upperSide <= x && upperSide <= y && upperSide <= rightSide) {		// 윗 면이 가까울 때
			System.out.println(upperSide);
		} else if(x <= y && x <= upperSide && x <= rightSide) {						// 왼쪽 면이 가까울 때
			System.out.println(x);
		} else if(rightSide <= x && rightSide <= y && rightSide <= upperSide) {		// 오른쪽 면이 가까울 때
			System.out.println(rightSide);
		}
		
	}
}
