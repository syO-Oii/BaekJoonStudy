package baekJoon_05;

import java.util.Scanner;

public class _10_baek5622 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String dial = sc.nextLine();
		int dialLength = dial.length();
		int count = 0;
		
		for(int i = 0 ; i < dialLength; i++) {
			char ch = dial.charAt(i);
			
			if(ch == '1'){
				count += 2;
			} else if(ch >= 'A' && ch <= 'C') {
				count += 3;
			} else if (ch >= 'D' && ch <= 'F') {
				count += 4;
			} else if (ch >= 'G' && ch <= 'I') {
				count += 5;
			} else if (ch >= 'J' && ch <= 'L') {
				count += 6;
			} else if (ch >= 'M' && ch <= 'O') {
				count += 7;
			} else if (ch >= 'P' && ch <= 'S') {
				count += 8;
			} else if (ch >= 'T' && ch <= 'V') {
				count += 9;
			} else if (ch >= 'W' && ch <= 'Z') {
				count += 10;
			} else {
				count += 11;
			}
		}
		System.out.println(count);
		sc.close();
		
	}

}
