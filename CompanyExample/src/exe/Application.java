package exe;

import java.util.Scanner;

import employees.DepartmentsService;
import employees.EmployeesService;

public class Application {
	Scanner sc=new Scanner(System.in);
	int selectNo=0;
	
	public Application() {
		run();
	}
	private void run() {
		menu();
		while(selectNo!=3) {
			switch (selectNo) {
			case 1:
				System.out.println("employees");
				employees();
				break;
			case 2:
				System.out.println("departments");
				departments();
				break;
			case 3:
				System.out.println("end of prog");
				break;

			}
		}
	}
	private void menu() {
		System.out.println("회사정보프로그램!~~~!ㅗ~!~!~!~!~!~!");
		System.out.println("1.사원 2.부서 3.종료");
		System.out.println("~!~!~!!~!~!~!~!~!~!~!~!~!~!~!~~!");
		System.out.println("입력>");
		selectNo=Integer.parseInt(sc.nextLine());
	}
	private void employees() {
		
		int employeesMenu=0;
		//CRUD
		EmployeesService es=new EmployeesService();
		while(employeesMenu!=4) {
			System.out.println("==================================");
			System.out.println("1.모든 사원 조회 2.사원 조회 3.등록 4.종료");
			System.out.println("==================================");
			System.out.println("입력>");
			
			employeesMenu=Integer.parseInt(sc.nextLine());
			switch(employeesMenu) {
			case 1:
				es.getEmployeesList();
				break;
			case 2:
				es.getEmployee();
				break;
				
			case 3:
				es.insertEmp();
				break;
			case 4:
				System.out.println("사원 업무 종료");
				break;
			}
		}
		
	}
	private void departments() {
		int departmentMenu=0;
		
		DepartmentsService ds=new DepartmentsService();
		while(departmentMenu!=4) {
			System.out.println("==================================");
			System.out.println("1.모든 부서 조회 2.사원 조회 3.등록 4.종료");
			System.out.println("==================================");
			System.out.println("입력>");
			
			departmentMenu=Integer.parseInt(sc.nextLine());
			switch(departmentMenu) {
			case 1:
				ds.getDeptList();
				break;
			case 2:
				ds.getDepartment();
				break;
			case 3:
				ds.insertDept();
				break;
			case 4:
				System.out.println("부서 업무 종료");
				break;
			
			}
		}
	}
}
