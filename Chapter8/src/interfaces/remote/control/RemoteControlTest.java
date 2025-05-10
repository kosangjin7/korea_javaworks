package interfaces.remote.control;

public class RemoteControlTest {

	public static void main(String[] args) {
		//부모 타입으로 객체생성
		RemoteControl rcTV=new Television();
		
		rcTV.turnOn();
		rcTV.setVolume(7);
		rcTV.turnOn();

	}

}
