package departments;

public class Departments {
//dto임(프로세스 사이에서 데이터를 전송하는 객체)
	private int departmentID;
	private String departmentName;//varchar2는 STring
	
	
	public int getDepartmentID() {
		return departmentID;
	}
	public void setDepartmentID(int departmentID) {
		this.departmentID = departmentID;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	
	
}
