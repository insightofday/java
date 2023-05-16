package inherit;

public class Computer extends Calculator {
	@Override
	//annotation compiler에게 알려줌
	double areaCircle(double r) {
		System.out.println("오버라이딩한 메서드");
		return Math.PI*r*r;
}
}
