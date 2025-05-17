package set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetTest {

	public static void main(String[] args) {
		// Set타입으로 
		Set<String> set=new HashSet<>();
		
		//요소추가		
		set.add("Java");
		set.add("C++");
		set.add("Python");
		set.add("JDBC");
		set.add("Java");//중복 안됨

		//객체출력-순서가 없음
		System.out.println(set);
		
		//객체의 크기
		int size=set.size();
		System.out.println("총 요소수:"+size);
		
		//특정요소 검색-대소문자 구분
		if(set.contains("JDBC")) {
			System.out.println("jdbc");
		}
		
		//전체요소 출력-순서가 없으므로 인덱싱 안됨-반복자 클래스 사용
		Iterator<String> ir= set.iterator();
		while(ir.hasNext()) {
			String element=ir.next();
			System.out.println("\t"+element);
		}
		
		//요소 삭제
		if(set.contains("C++")) {
			set.remove("C++");
		}
		
		//향상 for- for(자료형 변수이름:set이름){}
		for(String element:set)
			System.out.println("\t"+element);
	}

}
