package abstract_class.car;

public abstract class Car {
 
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public abstract void drive();//추상메서드
	public abstract void stop();
	
	//템플릿 메서드-전체 기능의 흐름을 정의 하는 메서드
	public void run() {
		startCar();
		drive();
		stop();
		turnOff();
	}
}
