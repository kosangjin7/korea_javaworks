package generic.box;

public class Car {
	//default 멤버변수
	//같은 패키지에서 접근하고 다른 패키지에서 접근할 수 없음

	String name;
	public Car(String name){
		this.name=name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name;
	}
}
