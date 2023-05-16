package inherit;

public class Parent {
	Parent(){
		System.out.println("생성자");
	}
	
	String lastName;
	
	public void getInfo() {
		System.out.println("우리 가족의 성은"+lastName);
	}
	public void method1() {
		System.out.println("부모 객체 method1실행");
	}
	public void method2() {
		System.out.println("부모객체 method2실행");
	}
}
