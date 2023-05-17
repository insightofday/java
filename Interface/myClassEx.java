package Interface;

public class myClassEx {

	public static void main(String[] args) {
		System.out.println("==field1==");
		myClass mc=new myClass();
		
		mc.rc.turnOn();
		System.out.println("==constructor==");
		
		myClass mc2=new myClass(new Audio());
		//mc2.rc.turnOn();
		
		System.out.println("====method=====");
		myClass mc3=new myClass();
		mc3.method1();
		
		System.out.println("=======method====");
		myClass mc4=new myClass();
		mc4.method3(new television());
		mc4.method3(new Audio());

	}

}
