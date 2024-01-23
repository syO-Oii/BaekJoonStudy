package baekJoon_08;

import java.util.Scanner;

/*
 *  1 1   1/1 
 *  2~3   2 1/2 2/1
 *  4~6   3 3/1 2/2 1/3
 *  7~10  4 1/4 2/3 3/2 4/1
 *  11~15 5 5/1 4/2 3/3 2/4 1/5
 * 
 * */
public class _06_baek1193 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = 0;
		int y = 0;
		int N = sc.nextInt();
		boolean success = false;
		int count = 0;
		int result = 0;
		int beforeResult = 0;
		
		while(!success) {
			count++;
			beforeResult = result;
			result += count;
			if(N <= result) {
				N = N - beforeResult;
				if(count % 2 == 0) {
					x = count - (N - beforeResult) + 1;
					y = N - beforeResult;
				} else {
					x = N - beforeResult;
					y = count - (N - beforeResult) + 1;
				}
				success = true;
			}			
		}
		System.out.println(x + "/" + y);
		
	}
}
