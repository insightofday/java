package poly;

public abstract class Animal{
	public String kind;
	
	public void breath() {
		System.out.println("breathing");
	}
	public abstract void sound();
}
