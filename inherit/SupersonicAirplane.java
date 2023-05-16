package inherit;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL=1;
	
	public static final int SUPERSONIC=2;
	
	public int flyMode=NORMAL;//default는 normal비행

	@Override
	public void fly() {
		if(flyMode==SUPERSONIC) {
			System.out.println("초음속비행");
		}else {
		super.fly();
		}
	}

	
}
