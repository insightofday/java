package oop;

public class Book {
	String name;
	String type;
	int price;
	int no;
	String company;
	
	Book(){
	}
	Book(String name, String type, int price, int no, String company){
		this.name=name;
		this.type=type;
		this.price=price;
		this.no=no;
		this.company=company;
	}
	
	void getInfo() {
		System.out.println("책 이름: "+name);
		System.out.println("종류 : "+type);
		System.out.println("가격 : "+price+"원");
		System.out.println("출판사 : "+company);
		System.out.println("도서번호 : "+no);
	}

}
