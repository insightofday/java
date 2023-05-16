package poly;

public class castingExample {

	public static void main(String[] args) {
		Parent p=new Child();
		p.field="parent field";
		p.method1();
		p.method2();
		((Child) p).method3();
		//강제형변환(instanceof필요)
		//ClassCastException을 방지하기 위해
		Child child=(Child)p;
		
		child.field="parent field";
		child.method1();
		child.method2();
		
		Parent p2=new Parent();
		if(p2 instanceof Child02) {
			Child02 c2=(Child02)p2;
		}else {
			System.out.println("child02로 형변환이 필요함");
		}
		
		//Child02 c2=(Child02) p2;             참조변수를 형변환 한 것이기 때문에 강제 형변환의 의미x 
		
		System.out.println("============================");
		
		Parent parentA=new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB=new Parent();
		method1(parentB);
		//method2(parentB);
		
		
		Granpa gp= new Child();
		gp.method111();
		
		Dog dog=new Dog();
		human cat= new human();
		System.out.println("====================");
		dog.sound();
		cat.sound();
		
		//형변환(추상메서드는 구현부가 없어서 출력불가능하지만 그것을 구현한 자손클래스(실체클래스)에서 실행ㄱㄴ)
		//추상클래스는 무족건 구현되고 있기 때문에 조상추상클ㄹㅐ스로 자손을 갖고오기 ㄱㄴ
		Animal animal=cat;
		animal.sound();
		animal.breath();
		
		animalSound(new Dog());
		animalSound(new human());
		
	}

	public static void method1(Parent parent) {
		if(parent instanceof Child) {
			Child ch=(Child)parent;
			System.out.println("method1을 child타입으로 형변환 성공");
		}
		else {
			System.out.println("형변환실패");
		}
	}
	
	public static void method2(Parent parent) {
		Child child=(Child)parent;
		child.method1();
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	}
	
	
}
