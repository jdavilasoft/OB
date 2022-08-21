package pe.uebos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        double num = teclado.nextDouble();

        System.out.println("El precio con IVA incluido es: " + calculaIVA(num));
    }

    static double calculaIVA(double numero) {
        double iva = 0.21;
        return numero + (numero * iva);
    }
}
