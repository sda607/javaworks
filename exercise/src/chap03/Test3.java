package chap03;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {
		// 2.
		int x = 10;
		int y = 20;
		int z = (++x) + (y--); // 11 + 20
		System.out.println(z); //31
		System.out.println(y); //19 

		// 3.
		boolean stop = false;
		int i = 0;
		while(!stop) {
			i++;
			System.out.println("실행");
			if(i > 10)
				break;
		}
		
		// 4.
		int pencils = 534;
		int students = 30;
		
		// 남은 연필 개수
		int pencilsPerstudent = pencils % students;
		System.out.println(pencilsPerstudent);
		
		
		// 5.
		int var1 =5;
		int var2 = 2;
		double var3 = var1 /var2;
		int var4 = (int) (var3*var2);
		System.out.println(var4);
		
		//9.
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫 번째수: ");
		 double n1 = Double.parseDouble(sc.nextLine());
		 
		System.out.println("두 번째수: ");
		 double n2 = Double.parseDouble(sc.nextLine());
		 
		 System.out.println("--------------------------");
		 if(n2 == 0 || n2== 0.0) {
			 System.out.println("결과:무한대");
		 }else {
			 System.out.println("결과" + (n1/n2));
		 }
		 sc.close();
		 
		 //13.
		 int val = 0;
		 val += 10; //10
		 val -= 10; //0
		 System.out.println(val);//0
		 
		 
	}

}
