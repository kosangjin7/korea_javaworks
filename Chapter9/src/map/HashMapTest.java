package map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapTest {

	public static void main(String[] args) {
		// 
		//이름과 정수 저장하기
		
		Map<String,Integer>  map=new HashMap<>();
		
		//요소저장
		map.put("강감찬", 95);
		map.put("홍길동", 75);
		map.put("이순신", 80);
		
		//요소개수
		System.out.println("요소수:"+map.size()+"개");
		
		//요소 검색
		System.out.println("홍길동의 점수:"+map.get("홍길동")+"점");
		//요소 추가
		map.put("이순신", 90);
		
		//map객체 출력
		System.out.println(map);
		
		//요소 삭제
		if(map.containsKey("홍길동")) {//안전한 삭제
		map.remove("홍길동");
		}
		//전체출력-반복자 클래스(Iterator)사용,while문 사용
		Iterator<String> ir=map.keySet().iterator();
		while(ir.hasNext()) {
			String key=ir.next();
			Integer value=map.get(key);
			System.out.println(key+":"+value);
;		}
		
		

	}

}
