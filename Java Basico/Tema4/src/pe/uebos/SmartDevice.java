package pe.uebos;

public class SmartDevice {

	String marca;
	String modelo;
	String procesador;
	String memoriaROM;
	String color;
	boolean gps;
	boolean bluetooth;
	boolean wifi;

	public SmartDevice() {
	}

	public SmartDevice(String marca, String modelo, String procesador, String memoriaROM,
			String color, boolean gps, boolean bluetooth, boolean wifi) {
		this.marca = marca;
		this.modelo = modelo;
		this.procesador = procesador;
		this.memoriaROM = memoriaROM;
		this.color = color;
		this.gps = gps;
		this.bluetooth = bluetooth;
		this.wifi = wifi;
	}
}
