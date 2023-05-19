package CF;

import java.util.HashMap;
import java.util.Map;

public class Hashmap_ex2 {
	public static void main(String[] args) {
		Map<Student,Integer>map=new HashMap<>();
		map.put(new Student(1,"jljl"), 84);
		map.put(new Student(1,"jljl"), 90);//Student클래스에서 equals와hashcode를 재정의해서 같은 값으로 보고
											//키값의 중복을 허용하지 않는 map에 들어가지 않게 됨
		
		System.out.println("total is..."+map.size());
}
}
