package Activitats;

public class Act08 {

    public static void main(String[] args) {

        // Inicialitzem x amb el valor 3
        int x = 3;

        // x += x - x és equivalent a:
        // x = x + (x - x)
        // x - x = 3 - 3 = 0
        // x + 0 = 3
        x += x - x;

        // El valor final de x és 3
        System.out.println("El valor final de x és: " + x);
    }
}