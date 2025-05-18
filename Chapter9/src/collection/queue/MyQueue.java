package collection.queue;
//문자열을 저장할 Queue구조 구현
import java.util.ArrayList;

public class MyQueue {
	private ArrayList<String> arrayQueue;
	
	public MyQueue() {
		arrayQueue=new ArrayList<String>();
	}
	
	//요소추가-큐으 맨뒤에 추가
	public void enQueue(String data) {
		arrayQueue.add(data);
	}
	//요소삭제-큐으 맨앞(0번 인덱스)에서 삭제
	public String deQueue() {
		int len=arrayQueue.size();
		if(len==0) {
			System.out.println("큐가 비었습니다.");
			return null;//비어있음
		}
		
		return arrayQueue.remove(0);
	}

}
