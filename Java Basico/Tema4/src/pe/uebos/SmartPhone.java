package pe.uebos;

public class SmartPhone extends SmartDevice {

	String memoriaRam;
	String sisteOperativo;

	public SmartPhone() {
	}

	public SmartPhone(String marca, String modelo, String procesador, String memoriaInterna,
			String color, boolean gps, boolean bluetooth, boolean wifi, String memoriaRam,
			String sisteOperativo) {
		super(marca, modelo, procesador, memoriaInterna, color, gps, bluetooth, wifi);
		this.memoriaRam = memoriaRam;
		this.sisteOperativo = sisteOperativo;
	}

	@Override
	public String toString() {
		return "SmartPhone [marca=" + marca + "\n" +
				", modelo=" + modelo + "\n" +
				", procesador=" + procesador + "\n" +
				", memoriaROM=" + memoriaROM + "\n" +
				", color=" + color + "\n" +
				", gps=" + gps + "\n" +
				", bluetooth=" + bluetooth + "\n" +
				", wifi=" + wifi + "\n" +
				", memoriaRam=" + memoriaRam + "\n" +
				", sisteOperativo=" + sisteOperativo + "]\n";

	}

}
