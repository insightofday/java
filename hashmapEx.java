package CF;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class hashmapEx {

	public static void main(String[] args) {
		//key와value한 쌍을 묶어 entry라 부름
		Map<String,Integer>map=new HashMap<String,Integer>();
		
		map.put("ss", 11);
		map.put("sds", 51);
		map.put("sdas", 51);
		map.put("sdasdas", 51);
		map.put("ss", 55);
		map.put("ss", 11);
		
		System.out.println("Total is..."+map.size());
		
		System.out.println(map.get("ss"));//마지막에 들어온 key값이 입력됨
		
		//Iterator는 set에 있기 때문에 이 방식을 써야 함
		//1.keyset
		Set<String> keyset=map.keySet();
		
		Iterator<String>keyIterator=keyset.iterator();
		
		while(keyIterator.hasNext()) {
			String key=keyIterator.next();
			Integer value=map.get(key);
			System.out.println("key is..."+key+"\t value is..."+value);
		}
		
		//Iterator는 set에 있기 때문에 이 방식을 써야 함
		//2.entryset
		Set<Map.Entry<String,Integer>> entryset=map.entrySet();
		//Entry는 인터페이스
		Iterator<Map.Entry<String,Integer>>entryIterator=entryset.iterator();
		
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer>entry=entryIterator.next();
			String key=entry.getKey();
			Integer value=entry.getValue();
			System.out.println("key is.."+ key+"value is..."+ value);
		}System.out.println();
		//while문과 같은 동작을 함
		for(Map.Entry<String, Integer>mEntry:entryset) {
			String key=mEntry.getKey();
			Integer value=mEntry.getValue();
			System.out.println("key is.."+ key+"value is..."+ value);
		}
		
		
		
		//entry삭제
		map.remove("ss");
		System.out.println("total is..."+map.size());
		
		map.clear();//entry전체삭제
		System.out.println("total is..."+map.size());
		
		
	
	}

}
