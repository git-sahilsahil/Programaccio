package Activitats;

import java.util.Scanner;

public class Act01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat = new Scanner(System.in);
		System.out.println("Introdueix un num");
		double num1 = teclat.nextDouble();
		System.out.println("Introdueix segon num");
		double num2 = teclat.nextDouble();
		System.out.println( "La suma es:" + (num1 + num2));
		teclat.close();
	}

}