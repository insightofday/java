package employees;

import java.sql.Date;

public class Employees {
	//DTO(DataTransferObject)
	//VO(DTO+기능)>DTO를 포함한다고 보면 된당~~~
	//BEANS(WEB에서 마니 쓰임), VO, DTO는 비슷한 개념이라고 보면 댄당~~
	//DB의 정보를 저장하는 객체
	
	//DB의 칼럼명에서 언더바가 쓰였지만 java에서는 안 쓰는 게 관례종~~
	//DB:EMPLOYEE_ID>>Java:employeeId;
	
	//Employee_id:notnull number(6)
	//last_name:NN varchar2(25_)
	//email NN varchar2(25_)
	//hire_dante nn date
	//job_id nn varchar2(10)

	private int employeesID;
	private String lastName;
	private String email;
	private Date hireDate;
	private String jobId;
	//여기서는 하나만 담아오는 
	
	public int getEmployeesID() {
		return employeesID;
	}
	public void setEmployeesID(int employeesID) {
		this.employeesID = employeesID;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
	public String getJobId() {
		return jobId;
	}
	public void setJobId(String string) {
		this.jobId = string;
	}
	@Override
	public String toString() {
		return "Employees [employeesID=" + employeesID + ", lastName=" + lastName + ", email=" + email + ", hireDate="
				+ hireDate + ", jobId=" + jobId + "]";
	}
	
}
