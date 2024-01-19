package baekJoon_08;

import java.util.Scanner;

public class _07_baek2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int V = sc.nextInt();
		int location = 0;
		int count = 0;
		boolean check = false;
		
		while(!check) {
			count++;
			location += A;
			
			if(V <= location) {
				System.out.println(count);
				return;
			} else {
				location -= B;
				
			}
		}
		
	}
}
