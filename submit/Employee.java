package submit;

public class Employee {
	private String name;
	private int wage;
	Employee(){
		
	}
	
	protected Employee(String name, int wage){
		this.name=name;
		this.wage=wage;
	}
	
	public void getInformation() {
		System.out.printf("이름:%s,연봉:%d",name,wage);
	}

	public void print() {
		System.out.println("superClass");
	}
}
