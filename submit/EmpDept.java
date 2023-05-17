package submit;

public class EmpDept extends Employee {
		private String department;
		EmpDept(){
			
		}
		
		EmpDept(String name, int wage, String department){
			super(name, wage);
			this.department=department;
		}
		
		@Override
		public void getInformation() {
			super.getInformation();
			System.out.println("부서:"+department);
		}
		@Override
		public void print() {
			System.out.printf("SuperClass"+'\n'+"subClass");
			
		}
		
	
}
