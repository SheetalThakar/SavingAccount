package classexample;

public class Vehicle {
	private String make;
	private String model;
	private int year;
	
	Vehicle (String make, String model, int year)
	{
		this.make = make;
		this.model = model;
		this.year = year;
	}
	
	String getMake()
	{
		return make;
	}
	
	String getModel()
	{
		return model;
	}
	
	int getYear()
	{
		return year;
	}
	
	void print()
	{
		System.out.println("Make: " + make + ", Model: " + model + "Year: " + year);
	}

}
