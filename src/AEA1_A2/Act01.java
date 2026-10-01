package AEA1_A2;

import java.util.Scanner;

public class Act01 {

	public static void main(String[] args) {
		
		Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix el primer número:");
        int num1 = teclat.nextInt();

        System.out.println("Introdueix el segon número:");
        int num2 = teclat.nextInt();

        System.out.println("Introdueix el tercer número:");
        int num3 = teclat.nextInt();

        int gran;
        int petit;

        if (num1 >= num2 && num1 >= num3) {
            gran = num1;
        } else if (num2 >= num1 && num2 >= num3) {
            gran = num2;
        } else {
            gran = num3;
        }

        if (num1 <= num2 && num1 <= num3) {
            petit = num1;
        } else if (num2 <= num1 && num2 <= num3) {
            petit = num2;
        } else {
            petit = num3;
        }

        System.out.println("El número més gran és: " + gran);
        System.out.println("El número més petit és: " + petit);

        teclat.close();
	}

}
