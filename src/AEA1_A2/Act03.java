package AEA1_A2;

import java.util.Scanner;

public class Act03 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix un num:");
        int num1 = teclat.nextInt();

        if (num1 % 2 == 0) {
            System.out.println("És múltiple de 2");
        }

        if (num1 % 5 == 0) {
            System.out.println("És múltiple de 5");
        }

        if (num1 % 2 != 0 && num1 % 5 != 0) {
            System.out.println("No és múltiple ni de 2 ni de 5");
        }

        teclat.close();
    }
}