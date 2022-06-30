package singleton;

public class Cardmain {

	public static void main(String[] args) {
		
		CardCompany company = CardCompany.getInstance();
		
		Card card1 = company.createCard();
		System.out.println("card1 : "+ card1.getCardNumber());
		Card card2 = company.createCard();
		System.out.println("card1 : "+ card2.getCardNumber());
		Card card3 = company.createCard();
		System.out.println("card1 : "+ card3.getCardNumber());
	}

}
