package baekJoon_10;

import java.util.Scanner;

public class _03_baek3009 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int y1 = sc.nextInt();
		int x2 = sc.nextInt();
		int y2 = sc.nextInt();
		int x3 = sc.nextInt();
		int y3 = sc.nextInt();
		int x4 = 0;
		int y4 = 0;
		
		sc.close();
		
		// 네번째 점 x값 찾기
		if(x1 == x2) {
			x4 = x3;
		} else if(x1 == x3) {
			x4 = x2;
		} else if(x2 == x3) {
			x4 = x1;
		}
		
		// 네번째 점 y값 찾기
		if(y1 == y2) {
			y4 = y3;
		} else if(y1 == y3) {
			y4 = y2;
		} else if(y2 == y3) {
			y4 = y1;
		}
		
		System.out.println(x4 + " " + y4);
		
	}
}
