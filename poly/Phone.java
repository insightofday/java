package poly;

public abstract class Phone {
	public String owner;
	
	public Phone(String Owner) {
		this.owner=Owner;
	}
	
	public void turnOn() {
		System.out.println("turn on");
	}
	public abstract void turnOff();//abstract+staticxxxxx
	
	public void superi() {
		System.out.println("supepr구현 알아보기");
	}
	

}
