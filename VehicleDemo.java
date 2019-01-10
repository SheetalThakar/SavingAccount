package classexample;

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Truck truck = new Truck("Ford", "F150", 2017, 0.5);
		System.out.println("Make = " + truck.getMake());
		System.out.println("Model = " + truck.getModel());
		System.out.println("Year = " + truck.getYear());
		System.out.println("Tonnage = " + truck.getTonnage());
		truck.print();
	}

}
