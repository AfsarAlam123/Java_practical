package Alam;

public class LaptopAPP {

	public static void main(String[] args) {
		Laptop l1= new Laptop();
		l1.lid=1234;
		l1.brand="hp";
		l1.cost=55454.87;
		l1.switchon();
		l1.switchoff();
		l1.info();
		new Laptop().switchoff();
		
		
		

	}

}
