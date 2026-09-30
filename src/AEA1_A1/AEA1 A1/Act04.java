package Activitats;

import java.util.Scanner;

public class Act4 {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		System.out.println("Introdueix kg:");
		double kg = teclat.nextDouble();
		System.out.println( kg + " son " + (kg * 2.20462)) ;
		teclat.close();
	}

}
