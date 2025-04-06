package methods;

public class VoidMethods {
	//인사하는 기능의 함수를 정의
	public static void sayHello() {
		System.out.println("안녕하세요~");
	}
	
	public static void sayHello(String name) {
		System.out.println(name+"님 안녕하세요~");
	}
	//main함수
	public static void main(String[] args) {
		
		sayHello();
		sayHello("정후");
		
	}

}
