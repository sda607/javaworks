package customer;

public class CustomerTest {

	public static void main(String[] args) {
		Customer customerLee = new Customer() ;
		
		customerLee.setCustomerName("이순산");
		
		//상품 구매
		int price = 10000;
		int price2 = 30000;
		
		customerLee.calcPrice(price);
		customerLee.calcPrice(price2);
		
		
		//고객정보 출력
		System.out.println(customerLee.showCustomerInfo()); 
	}

}
