package baekJoon_06;

import java.util.Scanner;

public class _06_baek2941 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		String croatia = sc.nextLine();
		
		for(int i = 0 ; i < croatia.length(); i ++) {
			if((i + 2) < croatia.length()) {
				if(croatia.charAt(i+2) == '=') {
					if(croatia.charAt(i+1) == 'z' && croatia.charAt(i) == 'd') {	// dz= 구별
						i += 2;	
					}
				}	
			}
			
			if((i + 1) < croatia.length()) {
				if(croatia.charAt(i+1) == '=') {	//c=, s=, z= 구별
					if(croatia.charAt(i) == 'c' || croatia.charAt(i) == 's' || croatia.charAt(i) == 'z') {
						i++;
					}	
				} else if(croatia.charAt(i+1) == '-') {		// c-, d- 구별
					if(croatia.charAt(i) == 'c' || croatia.charAt(i) == 'd') {
						i++;
					}	
				} else if(croatia.charAt(i+1) == 'j') {		// lj, nj 구별
					if(croatia.charAt(i) == 'l' || croatia.charAt(i) == 'n') {
						i++;
					}	
				}
			}
			count++;
		}		
		System.out.println(count);
		sc.close();
	}
}
