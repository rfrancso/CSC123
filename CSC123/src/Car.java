//in class example 02-08-23

public class Car {
	// Fields
	private String make;
	private short year;
	private int miles;
	private String model;
	private String color;
	private boolean engineRunning;
	private char gear; // 'R', 'N', 'D', 'P'
	private int currentSpeed;
	private boolean ignitionState;
	private int fuelLevel;

	public Car(String make, short year, String model, String color) {
		this.make = make;
		this.year = year;
		this.model = model;
		this.color = color;
		this.engineRunning = false;
		this.gear = 'N';
		this.currentSpeed = 0;
		this.ignitionState = false;
		this.fuelLevel = 0;
	}

	public String toString() {
		String s = "Engine Running: "+engineRunning+", Gear =" +gear;
		return s;
	}
	
	public void start()	{
		if(gear=='P')engineRunning=true;
	}
	
	public void stop() {
		
	}
}
