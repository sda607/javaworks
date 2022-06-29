package scorearray;

import java.util.Scanner;

public class CakeScore {

	public static void main(String[] args) {
		boolean run =true; //실행함수
		int studentNum = 0; //학생수(배열의 크기)
		int[] scores = null; //정수 배열
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("---------------------------------------------------------");
			System.out.println("1.학생수 | 2.점수 입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("---------------------------------------------------------");
			System.out.print("선택>");
			
			int selectNo = Integer.parseInt(scan.nextLine()); //문자를 정수로 변환
			
			if(selectNo == 1) {
				System.out.print("학생수>");
				studentNum = Integer.parseInt(scan.nextLine()); //학생수
				scores = new int[studentNum]; //학생수 만큼 점수의 크기
			}else if(selectNo == 2) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]>");
					scores[i] = Integer.parseInt(scan.nextLine());//점수입력
				}
			}else if(selectNo == 3) {
				for(int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]>"+ scores[i]);
				}
			}
			else if(selectNo == 4) {
				int sumV = 0;
				double avgV = 0.0;
				int maxV = scores[0];
				
				//총점
				for(int i = 0; i < scores.length; i++) {
					sumV += scores[i];
					if(maxV < scores[i])
						maxV = scores[i];
				}
//				System.out.println(sumV);
				avgV = (double)sumV / scores.length;
				System.out.println("평균 점수 : " + avgV);
				System.out.println("최고 점수 :" + maxV);
			}else if(selectNo == 5) {
				run = false;
			}else {
				System.out.println("지원되지 않는 기능입니다.");
			}
		}//while
		System.out.println("프로글매 종료!!");

	}//main
	
}
