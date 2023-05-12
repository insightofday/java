package oop;

public class application02 {

	public static void main(String[] args) {
		Bycycle bc=new Bycycle();
		
		bc.setGas(5);
		
		boolean gasState=bc.isLeftGas();
		if(gasState) {
			System.out.println("run");
			bc.run();
		}
		if(bc.isLeftGas()) {
			System.out.println("you don't need to fuel");
		}else {
			System.out.println("you can't run");
		}
	}

}
