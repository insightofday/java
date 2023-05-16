package poly;

public class abExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		smartPhone sp=new smartPhone("ㅁㅁ");
		sp.turnOn();
		sp.turnOff();
		System.out.println(sp.owner);
		
		Phone p=sp;
		p.turnOff();
		p.turnOn();
		
		smartPhone p2=(smartPhone)p;
		p2.turnOn();
		p2.turnOff();
		System.out.println(sp.owner);

	}

}
