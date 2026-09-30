package Activitats;

import java.util.Scanner;

public class Act11 {

    public static void main(String[] args) {

        // Creem el Scanner per introduir dades
        Scanner teclat = new Scanner(System.in);

        // PRODUCTE 1 

        System.out.println("Introdueix el preu del producte 1:");
        double preu1 = teclat.nextDouble();

        System.out.println("Introdueix la quantitat del producte 1:");
        int quantitat1 = teclat.nextInt();

        // Calculem el preu del producte 1 sense IVA
        double total1 = preu1 * quantitat1;

        // Calculem el preu del producte 1 amb IVA
        double total1IVA = total1 * 1.21;

        System.out.println("Preu producte 1 sense IVA: " + total1);
        System.out.println("Preu producte 1 amb IVA: " + total1IVA);


        //  PRODUCTE 2 

        System.out.println("Introdueix el preu del producte 2:");
        double preu2 = teclat.nextDouble();

        System.out.println("Introdueix la quantitat del producte 2:");
        int quantitat2 = teclat.nextInt();

        // Calculem el preu del producte 2 sense IVA
        double total2 = preu2 * quantitat2;

        // Calculem el preu del producte 2 amb IVA
        double total2IVA = total2 * 1.21;

        System.out.println("Preu producte 2 sense IVA: " + total2);
        System.out.println("Preu producte 2 amb IVA: " + total2IVA);


        //  PRODUCTE 3

        System.out.println("Introdueix el preu del producte 3:");
        double preu3 = teclat.nextDouble();

        System.out.println("Introdueix la quantitat del producte 3:");
        int quantitat3 = teclat.nextInt();

        // Calculem el preu del producte 3 sense IVA
        double total3 = preu3 * quantitat3;

        // Calculem el preu del producte 3 amb IVA
        double total3IVA = total3 * 1.21;

        System.out.println("Preu producte 3 sense IVA: " + total3);
        System.out.println("Preu producte 3 amb IVA: " + total3IVA);


        // TOTAL DE LA COMANDA 

        // Sumem els 3 productes sense IVA
        double totalSenseIVA = total1 + total2 + total3;

        // Sumem els 3 productes amb IVA
        double totalAmbIVA = total1IVA + total2IVA + total3IVA;

        System.out.println("Preu total de la comanda sense IVA: " + totalSenseIVA);
        System.out.println("Preu total de la comanda amb IVA: " + totalAmbIVA);

        // Tanquem el Scanner
        teclat.close();
    }
}
