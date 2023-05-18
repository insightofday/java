package objects;

public class mathc {
public static void main(String[] args) {
	//abs
	int v1=Math.abs(-1);
	System.out.println(v1);
	System.out.println(Math.abs(-3.3));
	System.out.println();
	
	//ceil
	System.out.println(Math.ceil(5.4));
	System.out.println(Math.ceil(-5.4));
	System.out.println();
	
	//floor
	System.out.println(Math.floor(5.3));
	System.out.println(Math.floor(-5.3));
	System.out.println();
	
	//max,min
	System.out.println(Math.max(5, 1));
	System.out.println(Math.min(8787, 1.24698));
	System.out.println();
	
	//random
	System.out.println(Math.random());
	System.out.println((int)(Math.random()*10));
	System.out.println();
	
	//rint (소수첫째자리가 5일 때,)정수부가 홀수면 올림, 정수부가 짝수면 버림
	System.out.println(Math.rint(8.5));
	System.out.println(Math.rint(7.5));
	System.out.println(Math.rint(3.5));
	System.out.println(Math.rint(10.5));
	System.out.println();
	
	//round(반올림)
	System.out.println(Math.round(1.7));
	System.out.println(Math.round(1.3));
	
}
}
