package customer;

public class CustomerTest2 {

	public static void main(String[] args) {
		// 매개변수 가진 생성자
		Customer Lee = new Customer(10010, "이순신");
//		VIPCustomer king = new VIPCustomer(10020, "세조대왕", 2012);
//		부모 클래스로 객체 생성 - 자동 형변환
		Customer king = new VIPCustomer(10020, "세조대왕", 2012);
		
		//상품구매
		int price = 10000;
		int LeePrice = calcPrice(price);
		int kingPrice = calcPrice(price);
		
		
		//고객 정보
		System.out.println(Lee.showCustomerInfo());
		System.out.println(king.showCustomerInfo());
		
		//지불 비용
		System.out.println(Lee.getCustomerName() + "님 지불금액 " + LeePrice + "입니다");

	}

}
