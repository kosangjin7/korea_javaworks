package abstract_class.animal;

public class AnimalTest {

	public static void main(String[] args) {
		// Cat갯체 생성
		Animal cat=new Cat();
		cat.breathe();
		cat.cry();
		
		Animal dog=new Dog();
		dog.breathe();
		dog.cry();

	}

}
