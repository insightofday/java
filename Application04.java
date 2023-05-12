package oop;

public class Application04 {

	public static void main(String[] args) {
		Book book= new Book("혼자 공부하는 자바", "학습서", 24000, 0001, "한빛미디어");
		
		book.getInfo();
		
		book=new Book();

	}

}
