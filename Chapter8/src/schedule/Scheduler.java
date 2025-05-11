package schedule;

public interface Scheduler {
	//2가지 업무(기능)
	//다음 전화 가져오기
	public void getNextCall();
	
	public void sendCallToAgent();
	

}
