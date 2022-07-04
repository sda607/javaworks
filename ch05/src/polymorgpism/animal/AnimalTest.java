package polymorgpism.animal;

public class AnimalTest {
	
	class Animal{
		public void move() {
			System.out.println("동물이 움직입니다.");
		}
	}
	
	class Human extends Animal{
		public void move() {
			System.out.println("사람은 두 발로 걷습니다.");
		}
	}
	
	class Eagel extends Animal{
		public void move() {
			System.out.println("독수리가 하늘을 납니다.");
		}
	}
	
	

	public static void main(String[] args) {
		AnimalTest aTest = new AnimalTest();
		
		//객체생성
		Animal human = new Human();
		
		Animal Eagel = new Eagel();
		
		aTest.moveAnimal(human);
	}

	public  void moveAnimal(Animal animal) {
		animal.move();
	}
}
