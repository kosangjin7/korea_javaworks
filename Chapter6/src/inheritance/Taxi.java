package inheritance;

public class Taxi extends Car {
	int passenger;
	Taxi(String brand,int year, int passenger){
		super(brand,year);
		this.passenger=passenger;
	}
	//부모 메서드 재정의(오버라이딩-Overriding)
	/* @Override
	 * void carInfo() {
		System.out.println("모델명:"+brand);
		System.out.println("연식:"+year);
		System.out.println("승객수:"+passenger);
		*/
	@Override
	void carInfo() {
		super.carInfo();//부모메서드 상속
		System.out.println("승객수:"+passenger);
	}
	}
	


