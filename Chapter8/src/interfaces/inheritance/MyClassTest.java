package interfaces.inheritance;

public class MyClassTest {

	public static void main(String[] args) {
		// MyClass객체생성
		MyClass myClass=new MyClass();
		
		//부모타입으로 형변환
		X x=myClass;
		x.x();
		
		Y y=myClass;
		y.y();
		
		//X,Y를 상속한 iClass객체생성
		//부모타입으로 자동 형변환
		 MyInterface iClass= myClass;
		 iClass.method();
		 iClass.x();
		 iClass.y(); 

	}

}
