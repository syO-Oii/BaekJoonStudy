package baekJoon_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _08_baek11022 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int T = Integer.parseInt(br.readLine());	// T 값 입력
		
		for(int i = 0 ; i < T ; i++) {
			st = new StringTokenizer(br.readLine());
			int A = Integer.parseInt(st.nextToken());	// A에 토큰 값 저장
			int B = Integer.parseInt(st.nextToken());	// B에 토큰 값 저장
			
			int result = A + B;		// 결과값 저장
			// 출력
			bw.write("Case #" + (i+1) + ": " + A + " + " + B + " = " + result + "\n");
		}
		br.close();
		bw.close();
	}
}
