package Introduccio;

import java.util.Scanner;

public class DemanarDades {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Per a demanar dades a l'usuari
		// utilitzarem la classe Scanner
		Scanner teclat = new Scanner(System.in);
		
		// Creem variable per guardar el nom
		String nom;
		
		System.out.println("Com et diuen?");
		
		//Espero resposta
		nom = teclat.next();
		
		// Salutació
		System.out.println("Hola, " + nom +"!");
		
		//Demana Edat
		System.out.println("Quants anys tens?");
		int edat = teclat.nextInt();
		
		System.out.println("Quina es la teva alsada?");
		double alsada = teclat.nextDouble();
		
		// Abans que s'acabi el programa haurem de tancar el teclat
		teclat.close();

	}

}
