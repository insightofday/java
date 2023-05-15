package oop;

public class singletonapp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Singleton s1=Singleton.getInstance();
		Singleton s2=Singleton.getInstance();
		
		System.out.println(s1==s2);//true출력(참조변수의 주소값이 일치함)
		
		s1.age=20;
		s1.name="d";
		
		System.out.println(s2.age);//s1.age 값이 출력됨
	
				
	}

}
