package customer;

public class GoldCustomer extends Customer{

	//필드(부모와 비교)
	private double saleRatio; //구매 할인율
	
	
	public GoldCustomer() {
		customeGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	//매개변수 가진 생성자
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		customeGrade = "GOLD";
		bonusRatio = 0.02;
		saleRatio = 0.1;
	}
	
	@Override
	public int calcPrice(int price) {
		//가격 =  가격 - (가격 x 구매할인율)
		price -= price - (int)(price * saleRatio);
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}
	
}
