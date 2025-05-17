package list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTest {

	public static void main(String[] args) {
		// List타입으로 ArrayList객체생성
		List<String> vegeList=new ArrayList<>();
		
		//요소추가
		vegeList.add("양파");
		vegeList.add("마늘");
		vegeList.add("감자");
		
		//리스트출력
		System.out.println(vegeList);
		
		//요소의 개수
		System.out.printf("총 요소수:%d개\n",vegeList.size());
		
		//특정요소검색
		//vegeList[0]-인덱스 검색은 안됨,get(인덱스)사용
		System.out.println(vegeList.get(0));
		System.out.println(vegeList.get(1));		
		
		//특정위치 추가
		vegeList.add(2,"콩나물");
		
		//요소수정-set(인덱스,요소)함수
		vegeList.set(1, "상추");		
	
		
		//전체요소 출력
		for(int i=0;i<vegeList.size();i++) {
			String vegetable=vegeList.get(i);
			System.out.println(vegetable+" ");			
			
		}
		//요소삭제-remove()
		vegeList.remove("감자");
		
		//향상된 for
		for(String vegetable:vegeList)
			System.out.println(vegetable+" ");
		}
	}


