package wrapper;

import java.util.ArrayList;

public class WrapperEx {

	public static void main(String[] args) {
		
//		int n = 10;
		
		//Integer의 num1 객체
		Integer num1 =100; //박싱 - 자동형변환
		int num2 = 200;
		int sum = num1.intValue() + num2;
		System.out.println(sum);
				
		//valueOf() : 문자열을 숫자로 변환하는 메서드
		Integer n1 = Integer.valueOf("300");
		System.out.println(n1);
		
		//parseInt() : 문자열을 정수로 변환
		int n2 = Integer.parseInt("400");
		System.out.println(n2);
		
		//Integer Type
		ArrayList<Integer> numList = new ArrayList<>();
		//정수 저장
		numList.add(1);
		numList.add(2);
		numList.add(3);
		
		//출력
		for(Integer num : numList)
			System.out.println(num + " ");
	}

}
