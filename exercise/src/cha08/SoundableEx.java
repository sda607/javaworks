package cha08;

public class SoundableEx {

	public static void printSound(Soundable soundable) {

		System.out.println(soundable.sound());
	}
	
	//메인
	public static void main(String[] args) {
		printSound(new Cat());
		printSound(new Dog());
	}

}
