package generic.box2;

import generic.box.Car;

//비제네릭 타입
public class Box {
	private Object obj;
	
	public void set(Object obj) {
		this.obj=obj;
	}
	
	public Object get() {
		return obj;
	}

	public Car get() {
		// TODO Auto-generated method stub
		return car;
	}

}
