package chap04;

public class Ex4_2 {

	public static void main(String[] args) {
		for(int i = 1; i < 5; i++ ) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*");
				if (j==i) {
					System.out.println();
				}
			}
		}
		
	}

}
