package Activitats;

import java.util.Scanner;

public class Act15 {

    public static void main(String[] args) {

        Scanner teclat = new Scanner(System.in);

        // Metodes de la classe Math

        // 1. abs
        System.out.println("Introdueix un numero enter:");
        int num = teclat.nextInt();

        System.out.println("El valor absolut d'aquest numero es " + Math.abs(num));

        // 2. round
        System.out.println("Introdueix un numero decimal:");
        double decimal = teclat.nextDouble();

        System.out.println("El numero arrodonit es " + Math.round(decimal));

        // 3. pow
        System.out.println("Introdueix la base:");
        double base = teclat.nextDouble();

        System.out.println("Introdueix l'exponent:");
        double exponent = teclat.nextDouble();

        System.out.println("La potencia es " + Math.pow(base, exponent));
        
        //4.sqrt (arrel quadrada)
        System.out.println("Introdueix un numero:");
        double num2 = teclat.nextDouble();
        System.out.println("L'arrel quadrarda d'aquest numero es" + Math.sqrt(num3));
        teclat.close();
        
        //5.boolean 
    }
}