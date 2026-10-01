package AEA1_A2;

import java.util.Scanner;

public class Act04 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix un número:");
        int num1 = teclat.nextInt();

        if (num1 == 1) {
            System.out.println("Dilluns");
        } else if (num1 == 2) {
            System.out.println("Dimarts");
        } else if (num1 == 3) {
            System.out.println("Dimecres");
        } else if (num1 == 4) {
            System.out.println("Dijous");
        } else if (num1 == 5) {
            System.out.println("Divendres");
        } else if (num1 == 6) {
            System.out.println("Dissabte");
        } else if (num1 == 7) {
            System.out.println("Diumenge");
        } else {
            System.out.println("No és un dia de la setmana");
        }

        teclat.close();
    }
}