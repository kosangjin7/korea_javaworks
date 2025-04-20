package polymorphism;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
}

class Human extends Animal{
	public void move() {
		System.out.println("사람이 두 발로 걷습니다.");
}

class Horse extends Animal{
		public void move() {
			System.out.println("말이 네발로 뜁니다.");
		}

	}

class Eagle extends AnimalTest{
		public void move() {
			System.out.println("독수리가 날아갑니다.");
		}

	}
	
	
	
public class AnimalTest {
	
	public void moveAnimal(Animal animal) {
		animal.move();
	}

  public static void main(String[] args) {
	  AnimalTest aTest=new AnimalTest();
	  //부모타입=자식타입(자동 형변환)
	/* Animal human=new Human();
	  Animal horse=new Horse();
	 
	  Human human=new Human();
	  Horse horse=new Horse();
	  
	  
	  
	  
	  
	  human.move();
	  horse.move();
	  */
	  
	 aTest.moveAnimal(new Human());
	  aTest.moveAnimal(new Horse());
	  aTest.moveAnimal(new Eagle());
	 
  }
	 
}	
	}

