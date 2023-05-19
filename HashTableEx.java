package CF;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableEx {

	public static void main(String[] args) {
		//hashtable은 동기화가 되어있고
		//hashmap은 동기화가 되어있지 않다는 점에서 차이가 나고 그 외의 점은 동일하다.
		Map<String,String>map=new Hashtable<>();
		
		map.put("Spring", "12");
		map.put("Summer", "12");
		map.put("fall", "12w");
		map.put("winter", "12");
		
		Scanner sc= new Scanner(System.in);
		while(true) {
			System.out.println("ID>");
			String id=sc.nextLine();
			System.out.println("PW>");
			String pw=sc.nextLine();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(pw)) {
					System.out.println("login success");
					break;
				}else {
					System.out.println("wrong pw");
				}
				}else {
					System.out.println("wrong id");
			}
			
		}

	}

}
