package baekJoon_06;

import java.util.Scanner;

public class _08_baek25206 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double result = 0;
		double avg = 0;
		int count = 0;
		String[][] subject = new String[20][3];		// 과목갯수 : 20개 // 과목명,
		
		// 띄어쓰기로 값 받음
		for(int i = 0 ; i < subject.length; i++) {
			subject[i][0] = sc.next();
			subject[i][1] = sc.next();
			subject[i][2] = sc.next();
		}
		
		// 평점 값 넣어주기
		for(int i = 0; i < subject.length; i ++) {
			switch(subject[i][2]) {
			case "A+":
				result += (double)4.5 * calGrade(subject[i][1]);
				count++;
				break;
			case "A0":
				result += (double)4 * calGrade(subject[i][1]);
				count++;
				break;
			case "B+":
				result += (double)3.5 * calGrade(subject[i][1]);
				count++;
				break;
			case "B0":
				result += (double)3 * calGrade(subject[i][1]);
				count++;
				break;
			case "C+":
				result += (double)2.5 * calGrade(subject[i][1]);
				count++;
				break;
			case "C0":
				result += (double)2 * calGrade(subject[i][1]);
				count++;
				break;
			case "D+":
				result += (double)1.5 * calGrade(subject[i][1]);
				count++;
				break;
			case "D0":
				result += (double)1 * calGrade(subject[i][1]);
				count++;
				break;
			case "F":
				result += (double)0 * calGrade(subject[i][1]);
				count++;
				break;
			case "P":
				// "P" 등급인 경우 계산하지 않고 다음 과목으로 넘어감
				break;
			default :
				break;
			}
			
		}
		// 평균 계산 후 출력
		avg = (double)result / count;
		System.out.println(avg);
		sc.close();
		
	}
	
	private static double calGrade(String grade) {
		switch(grade) {
		case "A+":
            return 4.5;
        case "A0":
            return 4.0;
        case "B+":
            return 3.5;
        case "B0":
            return 3.0;
        case "C+":
            return 2.5;
        case "C0":
            return 2.0;
        case "D+":
            return 1.5;
        case "D0":
            return 1.0;
        case "F":
            return 0.0;
        default:
            return 0.0;
		
		}
	}

}
