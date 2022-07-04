package customer;

import java.util.ArrayList;

public class CustomerList {

	public static void main(String[] args) {
		// 어레이리스트 자료구조를 사용하기
		ArrayList<Customer> customerList = new ArrayList<>();
		
		//실버고객 2명, 골드 2명,  vip 1명
		Customer lee = new Customer(10010, "이순신");
		Customer shin = new Customer(10020, "신사임당");
		Customer hong = new GoldCustomer(10030, "홍길동");
		Customer hun = new GoldCustomer(10040, "양석구");
		Customer king = new VIPCustomer(10050, "세종대왕", 1446);
		

		//자료추가
		customerList.add(lee);
		customerList.add(shin);
		customerList.add(hong);
		customerList.add(hun);
		customerList.add(king);
		
		//계산
		System.out.println("================할인율과 보너스 포인트 계산========");
		int price = 10000;
		for(Customer customer : customerList) {
			int costPrice =  customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이" + costPrice + "원 지불 하셨습니다.");
		}
		//고객정보
		System.out.println("================고객정보========");
		for(int i=0; i<customerList.size(); i++) {
			Customer Customer = customerList.get(i);
			System.out.println(Customer.showCustomerInfo());
		}
	}
}
