package API;

import java.util.HashMap;

public class objectExample {

	public static void main(String[] args) {
		member mem=new member("123");
		member mem2=new member("13");
		
		if(mem.equals(mem2)) {
			System.out.println("동등한 객체");
		}else {
			System.out.println("다른 객체");
		}
		
		HashMap<key,String> hm=new HashMap<>();
		hm.put(new key(1), "haha");
		
		String value=hm.get(new key(1));
		System.out.println(value);
		
		
		HashMap<member,String>member=new HashMap<>();
		
		member.put(new member("naw"), "nae");
		
		System.out.println(member.get(new member("naw")) );//member클래스에 hashcode가 오버라이딩 되어있지 않으면 null이 출력됨
		
		Object obj1=new Object();
		Object obj2=new Object();
		
	System.out.println(obj1);
	System.out.println(obj1.toString());//위나 아래나 같은 내용이 출력됨
	
	smartPhone sm=new smartPhone("ss",99,"gg");
	System.out.println(sm.toString());


	}

}
