package oop;

public class Student {
	String name;
	int grade;
	int kor;
	int eng;
	int math;
	
	
	Student(){
		
	}
	Student(String name, int grade,int kor,int eng,int math){
		this.name=name;
		this.grade=grade;
		this.kor=kor;
		this.eng=eng;
		this.math=math;
	}
	void getInfo(){
		System.out.println("이름은"+name);
		System.out.println("학년은"+grade);
		System.out.println("국어성적은"+kor);
		System.out.println("영어성적은"+eng);
		System.out.println("수학성적은"+math);
	}
}
