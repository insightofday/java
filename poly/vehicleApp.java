package poly;

public class vehicleApp {

	public static void main(String[] args) {
		Driver driver=new Driver();
		
		driver.drive(new Bus());
		taxi taxi=new taxi();
		driver.drive(taxi);
	}

}
