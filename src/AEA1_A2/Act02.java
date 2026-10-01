package AEA1_A2;

import java.util.Scanner;

public class Act02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclat = new Scanner(System.in);
		
		System.out.println("Introdueix un num:");
		int num = teclat.nextInt();
		
		if (num % 2 == 0) {
		System.out.println("Es Parell");
		} else System.out.println("Es Senar");
        teclat.close();

	}

}
