package exception;

public class trycatch {

	public static void main(String[] args) {
		try {
			System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누면 안돼");
			e.printStackTrace();//arithmeticexception의 조상인 thorable의 메서드
		}finally {}//finally는 옵션
		
		
		try {
//			System.out.println(10/0);
//			String str="java";
//			int a =Integer.parseInt(str);
			    //classnotfound exception
			Class claz=Class.forName("java.lang.String2");
		}catch(NumberFormatException n) {
			System.out.println("문자열은 정수로 바꾸지 못합니다.");
			n.printStackTrace();
		}catch(ArithmeticException e) {
			System.out.println("0으로 나누기 불가");
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}finally {
			System.out.println("finally는 옵션, 그리고 항상 실행됨");
		}
		
		try {
			findClass();
		}catch(ClassNotFoundException e) {
			System.out.println("there is no class");
		}
		findClass();//여기 클릭해서 trycatch써도 됨
			
	}

	public static void findClass() throws ClassNotFoundException {
		Class clazz=Class.forName("java.lang.String2");
	}
}
