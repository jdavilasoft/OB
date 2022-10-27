package pe.uebos;

public class ParteUno {

	public static void main(String[] args) {
		int suma = sumaNumeros(10, 20, 30);
		System.out.println("La suma de tres numeros es: " + suma);
	}

	private static int sumaNumeros(int x, int y, int z) {
		return x + y + z + 40;
	}
}
