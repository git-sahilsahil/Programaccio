package AEA1_A1;

import java.util.Scanner;

public class Act13_2 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix el nombre de minuts:");
        int mT = teclat.nextInt();

        int mF = mT % 60;

        int hT = mT / 60;

        int hF = hT % 24;

        int dT = hT / 24;

        int dF = dT % 7;

        int sF = dT / 7;

        System.out.println("Setmanes: " + sF);
        System.out.println("Dies: " + dF);
        System.out.println("Hores: " + hF);
        System.out.println("Minuts: " + mF);

        teclat.close();
    }
}