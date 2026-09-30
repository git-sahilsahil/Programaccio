package Activitats;

import java.util.Scanner;

public class Act02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat = new Scanner(System.in);
		System.out.println("Introdueix la base");
		int base = teclat.nextInt();
		System.out.println("Introdueix la altura");
		int altura = teclat.nextInt();
		int divisor = 2;
		double area = base * altura / (double) divisor;
		System.out.println("L'area es:" + area );
	
		teclat.close();
	}

}