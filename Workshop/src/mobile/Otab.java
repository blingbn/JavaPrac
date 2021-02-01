package mobile;
public class Otab extends Mobile{
	
	public Otab() {
		super();
	}

	public Otab(String name, int batterySize, String osType) {
		super(name, batterySize, osType);
	}

	@Override
	public int operate(int time) {
		setBatterySize(getBatterySize()-time*12);
		return getBatterySize();
	}

	@Override
	public int charge(int time) {
		setBatterySize(getBatterySize()+time*8);
		return getBatterySize();
	}
	
}
