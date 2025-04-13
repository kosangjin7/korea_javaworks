package salestatement;

public class Main {

	public static void main(String[] args) {
		// 객체생성
		Drink coffee=new Drink("커피",2500,4);
		Drink tea=new Drink("녹차",3500,3);
		Alcohol soju=new Alcohol("소주",4000,2,15.2f);
		
		//음료 매출 전표
		Drink.printTitle();
		coffee.printData();
		tea.printData();
		
		//알콜 매출 전표

		Alcohol.printTitle();
		soju.printData();
		
		int total=0;
		total=coffee.calcPrice()+tea.calcPrice()+soju.calcPrice();
		System.out.println("==========합계금액:"+total+"원*************");
	}

}
