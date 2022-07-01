package override;

public class ShopMain {

	public static void main(String[] args) {
		//HeadShop 객채 생성
//		HeadShop headshop = new HeadShop();
//		headshop.sellkimchiJJige();
//		headshop.sellDenjangJJige();
//		headshop.sellBibiBap();
		
		//shop1 클래스의 객체 생성
		Shop1 shop1 = new Shop1();
		
		shop1.sellDenjangJJige();
		shop1.sellkimchiJJige();
		shop1.sellBibiBap();
		
		System.out.println("================");
		Shop2 Shop2 = new Shop2();
		Shop2.sellDenjangJJige();
		Shop2.sellkimchiJJige();
		Shop2.sellBibiBap();
	}

}
