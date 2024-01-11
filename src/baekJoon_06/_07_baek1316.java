package baekJoon_06;

import java.util.Scanner;

public class _07_baek1316 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.nextLine());
		int groupWordCount = 0;

		for(int i = 0 ; i < N ; i++) {
			String word = sc.nextLine();
			boolean[] visited = new boolean[26];	// 알파벳 개수만큼 생성
			boolean isGroupWord = true;
			int beforeIdx = -1;
			
			for(int j = 0; j < word.length(); j++) {
				char nowChar = word.charAt(j);
				int nowIdx = nowChar - 'a';		// 현 알파벳 위치
				
				// 현재 문자가 이전에 나온 적이 없거나 이전 문자와 연속된 경우
				if(!visited[nowIdx] || beforeIdx == nowIdx) {
					visited[nowIdx] = true;
					beforeIdx = nowIdx;
				} else {
					isGroupWord = false;
					break;
				}
			}
			
			if(isGroupWord) {
				groupWordCount++;
			}
		}
		
		System.out.println(groupWordCount);
		sc.close();
	}

}
