package Alam;

import java.util.Scanner;

class Prg3 {
	public static void main(String[] args) {
		Scanner scan= new Scanner (System.in);
		System.out.println("enter a byte value");
		byte a = scan.nextByte();
		System.out.println("Enter a short value ");
		short b = scan.nextShort();
		System.out.println("Enter a int value ");
		int c = scan.nextInt();
		System.out.println("Enter a long value ");
		long d = scan.nextLong();
		System.out.println("Byte value is :" +a);
		System.out.println("Short value is :" +b);
		System.out.println("Int value is :" +c);
		System.out.println("Long value is :" +d);
		
	}

}


