package transport;

public class Bus {
	private int busNumber;//버스 번호
	private int passenger;//버스 번호
	private int money;//버스 번호
	//승객수
	//버스 수입
	
	
	
	public Bus(int busNumber) {
		this.busNumber=busNumber;
	}
	
	public void take(int money) {
		
		this.money +=money;
		passenger++;
	}
	
	public void busInfo() {
		System.out.println(busNumber+"번 버스이 수입은"+money+"원이고,승객수는"+passenger+"명 입니다.");
	}
	

}
