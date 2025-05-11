package interfaces.remote.control;

public class SmartTVTest {

	public static void main(String[] args) {
		
		SmartTV tv=new SmartTV();
     //구현된 객체tv를 인터페이스형(부모타입)으로 객체 생성
		RemoteControl rc=new SmartTV();
		Searchable  searchable=new SmartTV();
		
		rc.turnOn();
		rc.setVolume(9);
		searchable.search("www.naver.com");
		rc.setMute(true);
		rc.turnOff();
		
		RemoteControl.changeBattery();
	}

}
