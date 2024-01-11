package baekJoon_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class _12_baek10951 {
	// EOF 개념 익히는 문제
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
		while(true) {
			// String 변ㄴ수에 입력값 저장
			String inputLine = br.readLine();
			
			// null값 확인
			if(inputLine == null || inputLine.trim().isEmpty()) {
				break;
			}
			// 띄어쓰기 " " 를 기준으로 입력값을 받은 후 나눔
			String[] tokens = inputLine.split(" ");
			
			int A = Integer.parseInt(tokens[0]);
			int B = Integer.parseInt(tokens[1]);
			int result = A + B;
				System.out.println(result);

		}
		br.close();
	}
}
