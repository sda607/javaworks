package reFerence;

public class SrtingEqealEx {

	public static void main(String[] args) {
//		char v1 = 'A';
//		
//		int[] score = {10, 20, 30};
//		참조 주소가 같은지 비교
		
		String strVal1 = "장그레";
		String strVal2 = "장그레";
		
		if(strVal1 == strVal2) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
		//참조 주소가 같은지 비교(==)
		String strVal3 = new String("장그레");
		String strVal4 = new String("장그레");
		
		//문자열이 같은지 비교
		if(strVal3 == strVal4) {
			System.out.println("같음");
		}else {
			System.out.println("다름");
		}
	}

}
