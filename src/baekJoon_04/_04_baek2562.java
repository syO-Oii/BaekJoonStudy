package baekJoon_04;

import java.util.Scanner;

public class _04_baek2562 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] n = new int[9];
		int max = 0;
		int maxLocation = 0;
		
		for(int i = 0; i < 9; i++) {
			n[i] = sc.nextInt();
			if(max < n[i]) {
				max = n[i];
				maxLocation = i + 1;
			}
		}
		System.out.println(max + "\n" + maxLocation);
		sc.close();
	}

}
