package employees;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeesService {
	//실행<->데이터를 가공하는 class(EmployeesService):데이터입출력<->DB(DAO)
	Scanner sc= new Scanner(System.in);
	//전체조회
	public void getEmployeesList() {
		List<Employees>list=EmployeesDAO.getInstance().getEmployeesList();
		
		for(int i=0;i<list.size();i++) {
			System.out.println(list.get(i).toString());
		}
	}
	public void getEmployee() {
		System.out.println("사번 입력>");
		int empId=Integer.parseInt(sc.nextLine());
		Employees emp=EmployeesDAO.getInstance().getEmployee(empId);
		
		if(emp!=null) {
			System.out.println("EMployeID is..."+emp.getEmployeesID());
			System.out.println("LastNAme is...."+emp.getLastName());
			System.out.println("email is...."+emp.getEmail());
			System.out.println("Hiredate is---"+emp.getHireDate());
			System.out.println("job id is..."+emp.getJobId());
		}else {
			System.out.println("존재하지 않는 사번입니다.");
		}
	}
	public void insertEmp() {
		Employees emp=new Employees();
		System.out.println("======사원등록=======");
		System.out.println("사번>");
		emp.setEmployeesID(Integer.parseInt(sc.nextLine()));
		System.out.println("이름>");
		emp.setLastName((sc.nextLine()));
		System.out.println("이메일>");
		emp.setLastName((sc.nextLine()));
		System.out.println("입사일>");
		emp.setHireDate(Date.valueOf(sc.nextLine()));
		System.out.println("직책>");
		emp.setJobId(sc.nextLine());
		
		int result=EmployeesDAO.getInstance().insertEmp(emp);
		
		if(result>0) {
			System.out.println("사원 입력 완료");
		}else {
			System.out.println("사원 입력 실패");
		}
	}
}
