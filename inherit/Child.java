package inherit;

public class Child extends Parent{
	String name;
	
	
	@Override
	public void getInfo(){
		super.getInfo();
		System.out.println("내 이름은"+lastName+name);
	}
	@Override
	public void method1() {
		super.getInfo();
		System.out.println("자식 객체 method1실행");
	}

	public void method3() {
		this.getInfo();
		System.out.println("자식객체mehod3실행");
	}
}
