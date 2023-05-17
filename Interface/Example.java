package Interface;


public class Example {

	public static void main(String[] args) {
		remoteControl rc=new television();
		
		rc.turnOn();
		rc.setVolume(5);
		rc.setVolume(12);
		rc.setVolume(-1);
		rc.turnOff();
		
		System.out.println();
		
		rc=new Audio();
		rc.turnOn();
		rc.setVolume(10);
		rc.setVolume(500);
		rc.setVolume(-4);
		rc.turnOff();
		
		rc=new television();
		rc.search("hahaha");
		
		searchable s=new television();
		s.search("hahah");
		
		
		System.out.println();
		
		interfaceC c=new implementsC();
		c.method1();
		c.method2();
		c.method3();
		
		
	
		
	}	

}
