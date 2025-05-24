package member.list;

import java.util.ArrayList;
import java.util.List;

public class ShapeTest {

	public static void main(String[] args) {
		 //List타입으로 Shape객체를 저장할 Arraylist생성
		List<Shape> list=new ArrayList<>();
		
		//자료저장-다형성을 이용한 객체생성
		list.add(new Shape());
		list.add(new Circle());
		list.add(new Triangle());
		
		//출력
		for(Shape s:list)
			s.draw();
		
		for(int i=0;i<list.size();i++) {
			Shape s=list.get(i);
			s.draw();
		}
	}

}
