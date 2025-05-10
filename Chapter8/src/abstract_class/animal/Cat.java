package abstract_class.animal;

public class Cat extends Animal {
	
	public Cat() {
		this.kind="포유류";
	}

	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("야옹");
	}


}
