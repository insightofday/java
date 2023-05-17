package Interface;

import poly.Driver;

public class driverex {

	public static void main(String[] args) {
		
		driver driver=new driver();
		
		driver.drive(new bus());
		driver.drive(new taxi());
	}

}
