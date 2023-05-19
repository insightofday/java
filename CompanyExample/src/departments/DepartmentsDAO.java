package departments;

import java.util.ArrayList;
import java.util.List;

import common.DAO;

public class DepartmentsDAO extends DAO {
	private static DepartmentsDAO dDAO=null;
	private DepartmentsDAO() {
		
	}//싱글톤이라서 생성자도private이넹~~
	public static DepartmentsDAO getInstance() {
		if(dDAO==null) {
			dDAO=new DepartmentsDAO();
		}return dDAO;
	}
	//모든부서조회
	public List<Departments> getDeptList(){
		List<Departments>list=new ArrayList<>();
		Departments dept=null;
		try {
			conn();
			String sql="SELECT * FROM departments";
			pstmt=conn.prepareStatement(sql);
			rs=pstmt.executeQuery();//rs는 조회된 모든 결과가 저장됨
			
			while(rs.next()) {
				dept=new Departments();
				dept.setDepartmentID(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
				list.add(dept);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConn();
		}
		return list;
	}
	//부서조회(1건만)
	public Departments getDepartment(int deptID) {
		Departments dept=null;
		try {
			conn();
			String sql="SELECT * FROM departments where department_id=?";
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, deptID);
			rs=pstmt.executeQuery();
			if(rs.next()) {
				dept=new Departments();
				dept.setDepartmentID(rs.getInt("department_id"));
				dept.setDepartmentName(rs.getString("department_name"));
			}
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConn();
		}
		return dept; 
	}
	
	//data등록
	public int insertDept(Departments dept) {
		int result=0;
		try {conn();
		String sql="insert into departments (department_id, department_name) values(?,?)";
		pstmt=conn.prepareStatement(sql);
		pstmt.setInt(1, dept.getDepartmentID());
		pstmt.setString(2, dept.getDepartmentName());
		
		result=pstmt.executeUpdate();
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			disConn();
		}
		
		return result;
	}
}
