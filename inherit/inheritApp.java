package inherit;

public class inheritApp {

	public static void main(String[] args) {
		Child ch=new Child();
		
		ch.getInfo();
		ch.method1();
		ch.method2();//오버라이딩 하지 않아서 부모의 매서드가 실행
		ch.method3();
		
	}

}
