package baekJoon_05;

import java.util.Scanner;

public class _06_baek10809 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		// 아스키코드 97 = a , 122 = z
		for(int i = 97 ; i < 123; i++) {
			System.out.print(S.indexOf((char)i) + " ");		// indexOf(String s) = s의 문자값이 몇번째에 있는지 출력해주는 함수
		}
		
		sc.close();
	}

}
