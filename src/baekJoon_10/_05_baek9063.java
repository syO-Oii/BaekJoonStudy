package baekJoon_10;

import java.util.Scanner;

public class _05_baek9063 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] x = new int[N];
		int[] y = new int[N];
		
		for(int i = 0 ; i < N; i++) {
			x[i] = sc.nextInt();
			y[i] = sc.nextInt();
		}
		
		sc.close();
		
		int maxX = x[0];
		int maxY = y[0];
		int minX = x[0];
		int minY = y[0];
		
		for(int i = 0; i < N; i++) {
			if(maxX <= x[i]) { maxX = x[i]; }
			if(maxY <= y[i]) { maxY = y[i];	}
			if(minX >= x[i]) { minX = x[i]; }
			if(minY >= y[i]) { minY = y[i]; }
		}
		
		int area = (maxX - minX) * (maxY - minY);
		System.out.println(area);
	}
}
