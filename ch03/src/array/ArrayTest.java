package array;

public class ArrayTest {

	public static void main(String[] args) {
		
		//숫자를 5개 저장할 배열
		int[] num = new int[] {90, 80, 10, 45, 60 };
		
		for(int i : num)
			System.out.println(i);
		
		//문자열을 3개 저장할 배열
		String[] str = new String[3];
		
				
		//제품을 3개 저장할 배열
		Product[] product = new Product[3];
		product[0] = new Product("notebook", 100000);
		
		System.out.println(product[0].showInfo());
	}

	
			
}
