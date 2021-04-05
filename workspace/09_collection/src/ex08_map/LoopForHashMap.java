package ex08_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class LoopForHashMap {

	public static void main(String[] args) {
		
		Map<String, String> me=new HashMap<String, String>();
		me.put("name", "전순조");
		me.put("age", 34+"");
		me.put("phone", "010-8399-3625");
		
		// 1. me에서 key만 빼는 메소드 : keySet()
		// 1) 향상 for문은 key를 뺀다
		Set<String> keys=me.keySet();
		for(String key:keys) {
			System.out.println(key+": "+me.get(key));
		}
		// 2) Iterator 인터페이스 사용
		Iterator<String> itr=keys.iterator();
		while(itr.hasNext()) {
			String key=itr.next();
			String value=me.get(key);
			System.out.println(key+": "+value);
		}
		
		// 2. 데이터 쌍(pair)으로 뺀다
		// entry : key와 value를 묶어서 뺀다
		// key : getKey()
		// value : getValue()
		Set<Map.Entry<String, String>> entrys=me.entrySet();
		// 1) 향상 for문
		for(Map.Entry<String, String> entry : entrys) {
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+": "+value);
		}
		// 2) Iterator 인터페이스 사용
		Iterator<Map.Entry<String, String>> itr2=entrys.iterator();
		while(itr2.hasNext()) {
			Map.Entry<String, String> entry=itr2.next();
			String key=entry.getKey();
			String value=entry.getValue();
			System.out.println(key+": "+value);
		}

	}

}
