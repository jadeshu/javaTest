package club.jadeshu.base.it.java.base.ch04;

 class Animal{
	void run(){
		System.out.println("Animal::run()");
	}
	
	void getRun(){
		System.out.println("Animal::getRun()");
	}
}

class Board extends Animal{
	void run(){
		System.out.println("Board::run()");
	}
	
	void getRun2(){
		System.out.println("Board::getRun2()");
	}
}

public class Demo03{
	public static void main(String[] args) {
		Animal b = new Board();
		((Board)b).getRun2();
		b.run();
	}
}