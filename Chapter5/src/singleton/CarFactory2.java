package singleton;

import singleton.car.Car;

public class CarFactory2 {
	//싱글톤 패턴으로 Carfactory클래스 작성
	private static CarFactory2 instance;
	
	
	private CarFactory2() {}
	
	public static CarFactory2 gerInstance() {
		//공장은 1개만 생성됨
		if(instance == null)
			instance=new CarFactory2();
		return instance;
	}
	
	//자동차 생성 메서드 정의
	public Car createCar() {
		//자동차는 여러 개 생성 가능
		Car car=new Car();
		return car;
	}
	
	
}
