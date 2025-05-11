package generic.box;

public class BoxTest {

	public static void main(String[] args) {
		// String형
		Box<String> box1=new Box<>();
		box1.set("행운을 빌어요!");
		
		String msg=box1.get();
		System.out.println(msg);
		
		Box<Integer> box2=new Box<>();
		box1.set(100);
		
		String num=box2.get();
		System.out.println(num);
		
		//참조자료형
		Box<Car> box3=new Box<>();
		box3.set(new Car("아니오닉6"));
		Car car=box3.get();
		System.out.println(car);

	}

	}

}
