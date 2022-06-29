package builtinclass;

import java.util.Calendar;

public class passdeTime {

	public static void main(String[] args) {
		Calendar startDay = Calendar.getInstance();
		Calendar today = Calendar.getInstance();
		
		//startDay
		startDay.set(2022, 5, 9);
		System.out.println(startDay.get(Calendar.YEAR) + "년" + startDay.get(Calendar.YEAR) + "년" + 
					(startDay.get(Calendar.MONDAY) + 1) + "월 " + startDay.get(Calendar.DATE) + "일");
		
		//오늘 날짜
		today.set(2022, 6, 29);
		System.out.println(today.get(Calendar.YEAR) + "년" + today.get(Calendar.YEAR) + "년" + 
				(today.get(Calendar.MONDAY) + 1) + "월 " + today.get(Calendar.DATE) + "일");
		
		//오늘날짜 - 시작일
		long passedTime = today.getTimeInMillis() - startDay.getTimeInMillis();
		//밀리즈 로 일 로 환산
		passedTime = passedTime / (24 * 60 * 60 * 1000);
		System.out.println("만난 지" + passedTime + "일이 지났습니다.");
	}

}
