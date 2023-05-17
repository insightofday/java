package exception;

public class exceptionex {

	public static void main(String[] args) {
		//npe
		String data=null;
		System.out.println(data);
		
		//ArrayIndexOutOfBoundsException
		int[]intAry=new int[3];
		intAry[0]=1;
		intAry[10]=10;
		
		//ArithmeticExceptio(0으로 나눌 때 생기는 오류)
		
		//NumberFormatException
		String str="java";
		System.out.println(Integer.parseInt(str));
		str="";
		System.out.println(str);
		
		//ClassCaseException(형변환 오류)==방지를 위해 instanceof사용
		
		
		//ClassNotFoundException(자바파일==클래스파일 못 찾을 때)
		//ㄴ1실행메소드(main)못 찾을 때
		//ㄴ2java파일을 못 찾은 경우
		
		
		//IOExepction
		//file reading/write시에 마니 발생(경로는 알지만 파일업서ㅠ)
		
		
		//FileNotFoundException
		//경로를 찾지 못해서 생기는 오류
		

		
		//OutOfMemoryError
		//memory부족 할 때(메모리누수)
		
		
	}

}
