package AEA1_A1;

import java.util.Scanner;

public class Act06 {

	public static void main(String[] args) {
		Scanner teclat = new Scanner(System.in);
		System.out.println("Introdueix preu:");
		double preu = teclat.nextDouble();
		System.out.println("Introdueix unitats:");
		int unitats = teclat.nextInt();
		System.out.println("El Import final es:" + (unitats * preu * 1.21));
		teclat.close();
	}

}