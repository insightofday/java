package oop;

public class car {
	String name;
	int price;
	String company;
	car(){
		
	}
	car(String name){
		this(name,1000,"g");//this로 생성자를 호출
		System.out.println("insert name");
		//this(name,1000,"g");이게 끝에 오면 안 됨
	}
	
	car(String name, int price, String company){
		this.name=name;
		this.price=price;
		this.company=company;
	}
}
