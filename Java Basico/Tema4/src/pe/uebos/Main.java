package pe.uebos;

public class Main {

	public static void main(String[] args) {

		SmartPhone telefono = new SmartPhone();
		telefono.marca = "Samsung";
		telefono.modelo = "Galaxy A53 5G";
		telefono.procesador = "Octa-Core 2.4GHz/2GHz";
		telefono.memoriaROM = "128 GB";
		telefono.color = "Negro";
		telefono.gps = true;
		telefono.bluetooth = true;
		telefono.wifi = true;
		telefono.memoriaRam = "6 GB";
		telefono.sisteOperativo = "Android";

		System.out.println(telefono);

		SmartWatch reloj = new SmartWatch();
		reloj.marca = "Apple";
		reloj.modelo = "MKQ63BE/A";
		reloj.procesador = "Chip S5 SiP con procesador de doble núcleo de 64 bits";
		reloj.memoriaROM = "1 GB";
		reloj.color = "Azul";
		reloj.gps = true;
		reloj.bluetooth = true;
		reloj.wifi = true;
		reloj.colorPulsera = "Azul";
		reloj.sistemaCompatible = "Apple";

		System.out.println(reloj);

	}

}
