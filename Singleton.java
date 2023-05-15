package oop;

public class Singleton {
	//싱글톤 기법: 외부에서 생성자를 사용하지 못하도록 막고, 본인의 클래스 내에서 만들어서 객체가 하나만 생성되도록 하는 기법
	//외부클래스에서 이것을 호출해도 같은 주소값이 저장됨
	
	private static Singleton single= new Singleton();
	private Singleton() {
	}
	public static Singleton getInstance() {
		return single;
	}
	public int age;
	public String name;
	
}

/////////////////위랑 아래랑 같음
//위 예제는 사용하지 않아도 static을 실행하여서 쓸모없는 메모리를 사용하는 반면,
//밑은 사용할 때에만 생성되도록 해서 메모리를 절약할 수 있음

class Singleton2{

	private static Singleton2 single= null;
	
	private Singleton2() {
	}
	
	public static Singleton2 getInstance() {
		if(single==null) {
			single=new Singleton2();
		}
		return single;
	}
	public int age;
	public String name;
	
}
