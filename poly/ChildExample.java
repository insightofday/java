package poly;

public class ChildExample {

	public static void main(String[] args) {
		Parent p=new Child();
		p.method2();
		p.method1();
		p.field="parent";
		
		p=new Child02();
		p.method2();
		p.method1();
		
		

	}

}

