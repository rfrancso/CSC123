
public class Oven {
	
	private int maxTemperature;
	private int numberOfDoors;
	private String make;
	private String model;
	private int width;
	private int height;
	private int weight;
	
	
	
	public int getMaxTemperature() {
		return maxTemperature;
	}



	public int getNumberOfDoors() {
		return numberOfDoors;
	}



	public String getMake() {
		return make;
	}



	public String getModel() {
		return model;
	}



	public int getWidth() {
		return width;
	}



	public int getHeight() {
		return height;
	}



	public int getWeight() {
		return weight;
	}



	public Oven(int maxTemperature, int numberOfDoors, String make, String model, int width, int height, int weight) {
		super();
		this.maxTemperature = maxTemperature;
		this.numberOfDoors = numberOfDoors;
		this.make = make;
		this.model = model;
		this.width = width;
		this.height = height;
		this.weight = weight;
	}



	public void powerOm() {
		System.out.println("Oven turned on");
		
	}

}
