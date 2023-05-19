package employees;

import java.util.List;
import java.util.Scanner;

import departments.Departments;
import departments.DepartmentsDAO;

public class DepartmentsService {

	Scanner sc=new Scanner(System.in);
	//전체조회
	public void getDeptList() {//여기 getdeptlist는 서비스클래스의 메서드
		List<Departments>list=DepartmentsDAO.getInstance().getDeptList();//여기 getdeptlist는 dao클래스의 메서드
		//일부러 메서드의 이름을 통일시킴
		for(int i=0;i<list.size();i++) {
			System.out.println("===========================================");
			System.out.println("departmentNo"+list.get(i).getDepartmentID());
			System.out.println("departmentName"+list.get(i).getDepartmentName());
		}
	}
	//등록
	public void insertDept() {
		System.out.println("#부서 등록");
		Departments dept=new Departments();
		System.out.println("부서 번호>");
		dept.setDepartmentID(Integer.parseInt(sc.nextLine()));
		System.out.println("부서 이름>");
		dept.setDepartmentName(sc.nextLine());
		
		int result=DepartmentsDAO.getInstance().insertDept(dept);
		
		if(result>0) {
			System.out.println("정상등록되었습니다.");
		}else {
			System.out.println("부서 입력 실패");
		}
	}
	//단건 조회
	public void getDepartment() {
		System.out.println("#부서 조회");
		System.out.println("부서 번호>");
		int deptID=Integer.parseInt(sc.nextLine());
		
		Departments dept=DepartmentsDAO.getInstance().getDepartment(deptID);
		
		if(dept==null) {
			System.out.println("없는 부서를 조회함");
		}
		else {
			System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
			System.out.println("부서 번호는"+dept.getDepartmentID()+"부서 이름은"+dept.getDepartmentName()+"입니다");
		}
	}
}
