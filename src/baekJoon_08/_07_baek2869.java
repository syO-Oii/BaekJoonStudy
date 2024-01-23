package baekJoon_08;
import java.util.Scanner;

public class _07_baek2869 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();	// 올라가는 높이	3
		int B = sc.nextInt();	// 내려가는 높이	2
		int V = sc.nextInt();	// 가지의 길이		10
		sc.close();
		
		// 마지막 날 달팽이는 미끄러지지 않음
		// 마지막 전날의 달팽이 높이 =  가지 길이(V) - 내려간 거리(B) - 1(하루 전)
		// 하루 변화량 = 3 - 2 = 1
		// * (마지막 전날 높이 / 하루 변화량) + 마지막날 하루
		// 따라서 (V - B - 1)
		
		
		

		

		
	}
}
