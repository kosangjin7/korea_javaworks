package transport;

public class Main {

	public static void main(String[] args) {
		// Persion객체
		Person p1=new Person("이정수",10000);
		Person p2=new Person("최인정",20000);
		
		//Bus 객체생성
		Bus bus100=new Bus(100);
		//버스요금
		int feeOfBus=1500;
		
		//버스타기	
		
		p1.takeBus(bus100,feeOfBus);
		p2.takeBus(bus100,feeOfBus);
		
		//정보출력
		p1.personInfo();
		p2.personInfo();
		bus100.busInfo();

	}

}
