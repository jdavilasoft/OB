package pe.uebos;

public class Coche {

	private int numPuertas = 0;

	public static void main(String[] args) {
		Coche miCoche = new Coche();
		miCoche.incrementaNumPuertas(1);

		System.out.println(miCoche);
	}

	public void incrementaNumPuertas(int numPuertas) {
		this.numPuertas = numPuertas;
	}

	public String toString() {
		return "El coche, tiene " + this.numPuertas + " puertas";
	}
	
}
