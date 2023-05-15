package oop;

public class Member {
	private String id;
	private String pw;
	private String name;
	private int age;
	
	Member(){
		
	}
	

	public int getAll() {
		return age;
	}

	public void setAll(int age ) {
		this.age=(age<0) ? age=0:++age;
//		if(age<0) {
//			age=0;
//		}
	}


	public void setId(String id) {
		this.id = id;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public void setName(String name) {
		this.name = name;
	}
	
	
	
}
