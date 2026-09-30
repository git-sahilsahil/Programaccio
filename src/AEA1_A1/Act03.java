package AEA1_A1;

import java.util.Scanner;

public class Act03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat = new Scanner(System.in);
		System.out.println("Introdueix l'alsada:");
		double alsada = teclat.nextDouble();
		System.out.println("Introdueix l'amplada:");
		double amplada = teclat.nextDouble();
		System.out.println(" El perimetre es:" + 2.0 * (alsada + amplada));
		teclat.close();
	}

}