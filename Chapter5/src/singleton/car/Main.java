package singleton.car;

import statics.Car;

public class Main {

	public static void main(String[] args) {
		// 자동차 공장객체생성
		CarFactory factory=CarFactory.getInstance();
		
		Car sonata1 = factory.createCar();
		Car sonata2 = factory.createCar();
		Car sonata3 = factory.createCar();
	
		System.out.println("소나타번호:"+sonata1.getCarNumber());
		System.out.println("소나타번호:"+sonata2.getCarNumber());
		System.out.println("소나타번호:"+sonata3.getCarNumber());

	}

}
