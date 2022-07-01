package statement;

public class Drink {
	//필드
	 String name;
	 int price;
	 int count;
	
	public Drink(String name, int price, int count) {
		this.name = name;
		this.price = price;
		this.count = count;
	}
	//계산
	public int getTotalPrice() {
		//가격 * 수량
		return price * count;
	} 
	//제목 출력
	public static void printTitle() {
		System.out.println("상품명\t가격\t수량\t금액");
	}
	
	//데이터 출력
	public void printData() {
		System.out.println(name + "\t"+ price + "\t" + count + "\t" + getTotalPrice());
	}
}
