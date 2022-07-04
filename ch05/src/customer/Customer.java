package customer;

public class Customer {
	
	private int customerID;
	private String customerName;
	protected String customeGrade;
	protected int bonusPoint;
	protected double bonusRatio;
	
	//생성자
	
	public Customer() {
		customeGrade = "SILVER";
		bonusRatio = 0.01; //1%
	}
	
	//매개 변수를 가진 생성자
	public Customer(int customerID, String customerName) {
		this.customerID = customerID;
		this.customerName = customerName;
		customeGrade = "SILVER";
		bonusRatio = 0.01; //1%
	}
	
	
	//getter, setter메서드
	public void setCustomerID(int customerID){
		this.customerID = customerID;
	}
	
	public int getCustomerID() {
		return customerID;
	}
	
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerName() {
		return customerName;
	}
	
	//보너스 적립 계산
	public int calcPrice(int price) {
		//보너스 포인트 = 가걱 x 보너스 적립율 // 형변환(인트)
		bonusPoint += (int) (price * bonusRatio);
		return price;
	}
	
	//고객 정보 출력
	public String showCustomerInfo() {
		return customerName + " 님의 등급은 " + customeGrade + "이며, 보너스 포인트는 "
				+ bonusPoint + " 점 입니다.";
	}
}
