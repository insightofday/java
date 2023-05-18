package objects;

public class wrapperc {
	public static void main(String[] args) {
		Integer obj=100;//오토박싱
		System.out.println(obj.intValue());
		
		int value=obj;
		System.out.println(obj);//오토 언박싱
		
		//연산 시에 오토언박싱이 됨
		int values=obj+500;
		System.out.println(values);
		
		
		//wrapperclass의 비교
		Integer obj1=200;
		Integer obj2=200;
		
	    System.out.println(obj1==obj2);//false
	    //int는 -128~127의 값만 비교가능하기때문에 false가 출력됨.따라서,
	    System.out.println(obj1.intValue()==obj2.intValue());//언박싱후에 비교를 해야 정확한 값이 출력됨
	    
	    double value1=Double.parseDouble("3.14");
	    System.out.println(value1);
	   
	}

}
