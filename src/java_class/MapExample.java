package java_class;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Map 이라는 인터페이스타입에 map 객체 / HashMap 이라는 클라스를 사용한다.
		//Integer 는 KEY 타입을 선언한 것 / 
		Map<Integer, String> map1 = new HashMap<>();
		
		//null 값이 나오는 이유 : (직전에 지정한 값)2번키에 저장되었던 값이 출력
		map1.put(1,"안녕하세요");
		System.out.println(map1.put(2,"Hello"));
		System.out.println(map1.put(2,"안녕?안녕?"));
		System.out.println(map1.put(2,"어려워"));
		System.out.println(map1.get(2));
		
		//값 : 안녕하세요
		String val1 = map1.get(1);
		System.out.println(val1);
		
		//값 : null
		map1.remove(2);
		System.out.println(map1.get(2));
		
		for(int key : map1.keySet()) {
			System.out.println(key);
			System.out.println(map1.get(key));
		}
	}

}
