package builtinclass;

import java.util.Calendar;

public class passdeTime2 {

	public static void main(String[] args) {
		Calendar startDay = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		
		//startDay
		startDay.set(2022, 5, 9);
		printDate(startDay);
		
		//오늘 날짜
		today.set(2022, 6, 29);
		printDate(today);
		
		
		
		//오늘날짜 - 시작일
		long passedTime = today.getTimeInMillis() - startDay.getTimeInMillis();
		//밀리즈 로 일 로 환산
		passedTime = passedTime / (24 * 60 * 60 * 1000);
		System.out.println("만난 지" + passedTime + "일이 지났습니다.");
	}

	private static void printDate(Calendar date) {
		System.out.println(date.get(Calendar.YEAR) + "년" + date.get(Calendar.YEAR) + "년" + 
				(date.get(Calendar.MONDAY) + 1) + "월 " + date.get(Calendar.DATE) + "일");
	}

}
