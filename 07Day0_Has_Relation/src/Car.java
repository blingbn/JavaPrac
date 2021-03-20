
public class Car {
	Engine engine;
	String modelName;
	public Car(Engine engine, String modelName) {
		super();
		this.engine = engine;
		this.modelName = modelName;
	}
	public Car() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Engine getEngine() {
		return engine;
	}
	public void setEngine(Engine engine) {
		this.engine = engine;
	}
	public String getModelName() {
		return modelName;
	}
	public void setModelName(String modelName) {
		this.modelName = modelName;
	}
	@Override
	public String toString() {
		return "Car [engine=" + engine + ", modelName=" + modelName + "]";
	}
	

}
