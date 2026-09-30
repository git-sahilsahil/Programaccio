package Activitats;

import java.util.Scanner;

public class Act14 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        System.out.println("Introdueix el primer nombre:");
        int n1 = teclat.nextInt();

        System.out.println("Introdueix el segon nombre:");
        int n2 = teclat.nextInt();

        int quocient = n1 / n2;
        int residu = n1 % n2;

        System.out.println("Quocient: " + quocient);
        System.out.println("Residu: " + residu);

        teclat.close();
    }
}