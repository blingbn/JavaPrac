package mobile;
public class Ltab extends Mobile{
	
	public Ltab() {
		super();
	}

	public Ltab(String name, int batterySize, String osType) {
		super(name, batterySize, osType);
	}

	@Override
	public int operate(int time) {
		setBatterySize(getBatterySize()-time*10);
		return getBatterySize();
	}

	@Override
	public int charge(int time) {
		setBatterySize(getBatterySize()+time*10);
		return getBatterySize();
	}
	
}
