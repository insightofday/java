package oop;

public class Bycycle {
//field
	int gas;
	
	
	//method
	void setGas(int gas) {
		this.gas=gas;
	}
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("there is no gas");
			return false;
		}
		System.out.println("gas in it");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("run. left"+gas+"L");
				gas-=1;
			}else {
				System.out.println("stop. left"+gas+"L");
				return;
			}
		}
	}
}

