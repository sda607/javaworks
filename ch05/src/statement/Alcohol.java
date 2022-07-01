package statement;

public class Alcohol extends Drink {
	//필드
		float alcper; //알콜도수
		
	public Alcohol(String name, int price, int count, float alcper) {
		super(name, price, count);
		this.alcper=alcper;
	}
	//static 메서드인 경우 @override 사용하지않음
	
	public static void printTittle() {
		System.out.println("상품명(도수[%])\t가격\t수량\t금액");
	}
	@Override
	public void printData() {
		System.out.println(name + "("+ alcper + ")\t"+ price + "\t" + count + "\t" + getTotalPrice());
	}
	
}
