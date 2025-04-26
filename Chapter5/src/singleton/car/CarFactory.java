package singleton.car;

public class CarFactory {
	//싱글톤 패턴으로 Carfactory클래스 작성
	private static CarFactory instance;
	
	
	private CarFactory() {}
	
	public static CarFactory getInstance() {
		//공장은 1개만 생성됨
		if(instance == null)
			instance=new CarFactory();
		return instance;
	}
	
	//자동차 생성 메서드 정의
	public Car createCar() {
		//자동차는 여러 개 생성 가능
		Car car=new Car();
		return car;
	}
	
	
}
