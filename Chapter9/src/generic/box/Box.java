package generic.box;

//제네릭타입
//T-type(자료형)을 의미
public class Box<T> {

	private T type;
	
	public void set(T type) {
		this.type=type;
	}
	public T get() {
		return type;
	}
}
