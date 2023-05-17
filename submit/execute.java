package submit;

public class execute {

	public static void main(String[] args) {
		EmpDept ed= new EmpDept("이지나",3000,"교육부");
		
		ed.getInformation();
		ed.print();
		System.out.println();
		
		
		//2번 실행문
				ObesityInfo oi=new ObesityInfo("홍길동",168,45); 
				oi.getStandardWeight();
				oi.getObesity();
				oi.getInformation();
				System.out.println();
				ObesityInfo oi2=new ObesityInfo("박둘이",168,90); 
				oi2.getStandardWeight();
				oi2.getObesity();
				oi2.getInformation();
				//oi2.getObesity();//////infinity뜸
				
				
				StandardWeightInfo so=new StandardWeightInfo("박둘이",168,90);
				//so.getStandardWeight();

					
	
	}

}
