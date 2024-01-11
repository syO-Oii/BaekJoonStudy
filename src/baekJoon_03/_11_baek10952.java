package baekJoon_03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class _11_baek10952 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		int A;
		int B;
		int result;
		boolean play = true;
		
		while(play) {
			st = new StringTokenizer(br.readLine());
			A = Integer.parseInt(st.nextToken());
			B = Integer.parseInt(st.nextToken());
			result = A + B;
			if(A == 0 && B == 0) {
				play = false;
			} else {
				bw.write(Integer.toString(result));
				bw.newLine();
			}
		}
		
		br.close();
		bw.close();
	}
}
