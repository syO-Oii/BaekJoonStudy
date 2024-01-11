package baekJoon_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _10_baek2439 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		for(int i = 1; i <= N ; i++) {
			
			for(int j = 1 ; j <= N - i ; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1 ; k <= i ; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		br.close();
	}
}
