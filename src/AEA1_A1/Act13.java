package AEA1_A1;

import java.util.Scanner;

public class Act13 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix les hores:");
        int hores = teclat.nextInt();

        System.out.println("Introdueix els minuts:");
        int minuts = teclat.nextInt();

        System.out.println("Introdueix els segons:");
        int segons = teclat.nextInt();

        int resultat = hores * 3600 + minuts * 60 + segons;

        System.out.println("El resultat en segons és: " + resultat);

        teclat.close();
    }
}