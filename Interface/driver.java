package Interface;

public class driver {
	public void drive(vehicle vehicle) {
		if(vehicle instanceof bus) {
			bus bus=(bus)vehicle;	
			bus.checkFare();
		}
		vehicle.run();
	}
}
