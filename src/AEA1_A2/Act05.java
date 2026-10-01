package AEA1_A2;

import java.util.Scanner;

public class Act05 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix el primer número:");
        int num1 = teclat.nextInt();

        System.out.println("Introdueix el segon número:");
        int num2 = teclat.nextInt();

        System.out.println("Introdueix el tercer número:");
        int num3 = teclat.nextInt();

        if (num1 >= num2 && num1 >= num3) {

            if (num2 >= num3) {
                System.out.println(num1 + " " + num2 + " " + num3);
            } else {
                System.out.println(num1 + " " + num3 + " " + num2);
            }

        } else if (num2 >= num1 && num2 >= num3) {

            if (num1 >= num3) {
                System.out.println(num2 + " " + num1 + " " + num3);
            } else {
                System.out.println(num2 + " " + num3 + " " + num1);
            }

        } else {

            if (num1 >= num2) {
                System.out.println(num3 + " " + num1 + " " + num2);
            } else {
                System.out.println(num3 + " " + num2 + " " + num1);
            }
        }

        teclat.close();
    }
}