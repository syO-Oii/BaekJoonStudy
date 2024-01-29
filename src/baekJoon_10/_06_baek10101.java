package baekJoon_10;

import java.util.Scanner;

public class _06_baek10101 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		if(x+y+z != 180) {
			System.out.println("Error");
		} else if ((x+y+z == 180) &&(x != y && y != z && x != z)) {
			System.out.println("Scalene");
		} else if (x == 60 && y == 60 && z == 60) {
			System.out.println("Equilateral");
		} else {
			System.out.println("Isosceles"); 
		}
		
		sc.close();
	}
}
