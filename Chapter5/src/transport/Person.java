package transport;

public class Person {
	private String name;
	private int money;
	
	public Person(String name, int money) {
		this.name=name;
		this.money=money;
		
	}
	
	public void takeBus(Bus bus,int fee) {
		bus.take(fee);
		this.money -=money;
	}
	
	public void personInfo() {
		System.out.println(name+"님의 남은 돈은"+money+"원 입니다.");
	}
}
