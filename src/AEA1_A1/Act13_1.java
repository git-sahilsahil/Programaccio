package AEA1_A1;

import java.util.Scanner;

public class Act13_1 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix el nombre de segons:");
        int sT = teclat.nextInt();

        int segonsF = sT % 60;

        int mT = sT / 60;

        int mF = mT % 60;

        int hF = mT / 60;

        System.out.println("Hores: " + hF);
        System.out.println("Minuts: " + mF);
        System.out.println("Segons: " + segonsF);

        teclat.close();
    }
}