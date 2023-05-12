package oop;

public class Application03 {
	//파라미터의 갯수를 모를 때 호출하는 방법(배열활용, 목록활용)

	public static void main(String[] args) {
		Computer computer=new Computer();
		
		//배열을 활용하는 방법
		int[]values1= {1,2,3};
		
		int result1=computer.sum1(values1);
		System.out.println(result1);
		
		result1=computer.sum1(new int[10]);//배열은 객체이기때문에 데이터가 전달되는 것이 아니라 주소값이 전달됨
		System.out.println(result1);
		
		result1=computer.sum1(new int[] {1,2,3,4});
		System.out.println(result1);
		
		//목록을 활용하는 방법
		int result2=computer.sum2(1,2,3);
		System.out.println(result2);
		
		result2=computer.sum2(1,2,3,4,5);
		System.out.println(result2);
		
		//system class는 
		//public final class System {
		//이라고 뜨는데, final 이 붙은 class 는 더이상 확장할 수 없다. 즉 상속받아서 사용할 수 없다는 것이다.

	}

}
