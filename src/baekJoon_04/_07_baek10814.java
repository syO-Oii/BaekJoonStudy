package baekJoon_04;

import java.util.Scanner;

public class _07_baek10814 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] student = new boolean[31];
		int[] badStudent = new int[2];
		int count = 0;
		
		//제출자 표시
		for(int i = 0 ; i < 28; i++) {
			int submitNum = sc.nextInt();
			student[submitNum] = true;
		}
		
		for(int i = 1; i <= 30; i++) {
			if(!student[i]) {
				badStudent[count++] = i;
				if(count == 2) {	// 미제출자 2명을 찾으면 바로 종료
					break;
				}
			}
		}
		
		// 오름차순 정렬
		if(badStudent[0] > badStudent[1]) {
			int change = badStudent[0];
			badStudent[0] = badStudent[1];
			badStudent[1] = change;
		}
		
		System.out.println(badStudent[0] + "\n" + badStudent[1]);
		sc.close();
		
	}
}
