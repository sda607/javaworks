package customer;

public class VIPCustomer extends Customer{
	//필드
	private int agentID; 	// 상담원 ID 
	private double saleRatio; //구매 할인율
	
	//생성자
	public VIPCustomer() {
		
		customeGrade = "SILVER";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	//매개변수
	public VIPCustomer(int customerID, String customerName, int agentID) {
		//부모 -ID, Name 이기 때문에 super 추가
		super(customerID, customerName);
		this.agentID = agentID;
		customeGrade = "SILVER";
		bonusRatio = 0.05;
		saleRatio = 0.1;
	}
	
	//출력
	
	public void setAgentID(int agentID) {
		this.agentID = agentID;
		customeGrade = "VIP";
	}
	
	public int getAgentID() {
		return agentID;
	}

	//가격 계산 재정의
	@Override
	public int calcPrice(int price) {
		//가격 =  가격 - (가격 x 구매할인율)
		price -= price - (int)(price * saleRatio);
		bonusPoint += (int)(price * bonusRatio);
		return price;
	}

	//고객 정보 재정의
	@Override
	public String showCustomerInfo() {
		return super.showCustomerInfo() + "\n담당 상담원 아이디는 "
				+ agentID + "입니다.";
	}
	
	
}


