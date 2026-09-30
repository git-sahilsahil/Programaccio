package AEA1_A1;

import java.util.Scanner;

public class Act05 {
    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Quants dòlars val un euro?");
        double canvi = teclat.nextDouble();

        System.out.println("Quants euros vols convertir?");
        double euros = teclat.nextDouble();

        double dolars = euros * canvi;

        System.out.println(euros + " euros són " + dolars + " dòlars.");

        teclat.close();
    }
}