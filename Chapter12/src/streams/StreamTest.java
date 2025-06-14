package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest {

	public static void main(String[] args) {
		// List자료구조 사용
		//List<String>  companyList=new ArrayList<>();
		
		//데이터 추가
		/*companyList.add("LG");
		companyList.add("삼성");
		companyList.add("Hyundai");*/
		
		
		//Arrays 클래스
				List<String> companyList=Arrays.asList("LG","삼성","Hyundai");

		for(String company:companyList)
			System.out.println(company);
		System.out.println("--------------------------");
		
		//Stream 클래스활용-람다식으로 구현,배열이나 컬렉션(리스트) 자료처리 할때 
		//stream 객체(인스턴스)생성
		//출력-forEach() 함수 사용
		Stream<String> stream=companyList.stream();
		stream.forEach(company ->System.out.println(company));
		
		
		//배열에서 
		String[] fruits = {"apple","banana","grape"};
		
		for(String fruit : fruits)
			System.out.println(fruit);
		
		//Stream 인스턴스 생성
		Stream<String> stream2=Arrays.stream(fruits);
		stream2.forEach(fruit -> System.out.println(fruit));
		
	}
	
	

}
