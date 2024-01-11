package baekJoon_06;

import java.util.Scanner;

public class _05_baek1157 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String word = sc.nextLine();
		word = word.toUpperCase();
		int[] alphabet = new int[26];
		int count = 0;
		int max = 0;
		
		// 값 초기화
		for(int i = 0; i < 26; i++) {
			alphabet[i] = 0;
		}
		
		// 각 단어마다 나온 횟수 카운트
		for(int i = 0; i < word.length(); i++) {
			int checkWord = word.charAt(i);
			alphabet[checkWord-65]++;
		}
		
		// 최대로 나온 값 확인
		for(int i = 0; i < 26; i++) {
			if(alphabet[max] < alphabet[i]) {
				max = i;
			}
		}
		
		// 최대값 중복 확인
		for(int i = 0; i < 26; i++) {
			if(alphabet[max] == alphabet[i]) {
				count++;
				if(count > 1) {
					// 중복값이 발생 한 경우 ? 출력 후 종료
					System.out.println("?");
					return;
				}
			}
		}
		// max = 알파벳 좌표값이므로 + 65를 해서 아스키코드 대문자 값을 찾아줌
		System.out.println((char)(max + 65));
		sc.close();
		
		
	}

}
