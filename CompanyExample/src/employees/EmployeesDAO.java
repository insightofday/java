package employees;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import common.DAO;

public class EmployeesDAO extends DAO{
	//singleton으로 DB에 접속
	private static EmployeesDAO empDao=null;
	
	private EmployeesDAO() {
		
	}
	public static EmployeesDAO getInstance() {
		if(empDao==null) {
			empDao=new EmployeesDAO();
		}return empDao;
	}
	
	
	//전체조회
	public List<Employees>getEmployeesList(){//List쓰는 이유: 테이블의 모든 정보를 담아오기 위함
		List<Employees>list=new ArrayList<>();
		Employees emp=null;
		try {
			conn();
			String sql="SELECT * FROM employees";
			stmt=conn.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()) {
				emp=new Employees();
				emp.setEmployeesID(rs.getInt("employee_id"));//getInt("aaa")에서 aa는 조회된 결과를 나타냄 coloumn명이 아니라 ~~as name으로 바꾸었다면 name을 써야함
				emp.setEmail(rs.getString("email"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setLastName(rs.getString("last_name"));
				list.add(emp);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConn();
		}
		
		return list;
	}
	
	///1나만 조회하긩~
	public Employees getEmployee(int empid) {
		Employees emp=null;//rs.next에서 데이터가 있으면(조회가 된다면) emp에는 객체가 담기지만, 그렇지 않다면 null값이 반환됨
		try {
			conn();
			String sql="SELECT * FROM employees WHERE employee_id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1,empid);//몇 번 째 물음표에 해당 칼럼을 입력할것인가?(몇번째,내용)
			rs=pstmt.executeQuery();
			
			if(rs.next()) {//data가 있을 때만 새로운 객체를 생성
				emp=new Employees();
				emp.setEmployeesID(rs.getInt("employee_id"));//getInt("aaa")에서 aa는 조회된 결과를 나타냄 coloumn명이 아니라 ~~as name으로 바꾸었다면 name을 써야함
				emp.setEmail(rs.getString("email"));
				emp.setHireDate(rs.getDate("hire_date"));
				emp.setJobId(rs.getString("job_id"));
				emp.setLastName(rs.getString("last_name"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConn();
		}
		return emp;
	}
	
	///insert
	
	public int insertEmp(Employees emp) {
		int result=0;//수행한 dml의 갯수가 저장되는 변수
		try {
			conn();
			String sql="insert into employees(employee_id, last_name, email, hire_date, job_id) values(?,?,?,?,?)";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, emp.getEmployeesID());
			pstmt.setString(2, emp.getLastName());
			pstmt.setString(3, emp.getEmail());
			pstmt.setDate(4, emp.getHireDate());
			pstmt.setString(5, emp.getJobId());
			result=pstmt.executeUpdate();
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConn();
		}
		return result;
	}
	
	
}
