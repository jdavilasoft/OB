package pe.uebos;

public class SmartWatch extends SmartDevice {

	String colorPulsera;
	String sistemaCompatible;

	public SmartWatch() {
	}

	public SmartWatch(String marca, String modelo, String procesador, String memoriaROM,
			String color, boolean gps, boolean bluetooth, boolean wifi, String colorPulsera,
			String sistemaCompatible) {
		super(marca, modelo, procesador, memoriaROM, color, gps, bluetooth, wifi);
		this.colorPulsera = colorPulsera;
		this.sistemaCompatible = sistemaCompatible;
	}

	@Override
	public String toString() {
		return "SmartWatch [marca=" + marca + "\n" +
				", modelo=" + modelo + "\n" +
				", procesador=" + procesador + "\n" +
				", memoriaROM=" + memoriaROM + "\n" +
				", color=" + color + "\n" +
				", gps=" + gps + "\n" +
				", bluetooth=" + bluetooth + "\n" +
				", wifi=" + wifi + "\n" +
				", colorPulsera=" + colorPulsera + "\n" +
				", sistemaCompatible=" + sistemaCompatible + "]\n";
	}

}
