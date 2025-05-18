package collection.queue;

public class MyQueueTest {

	public static void main(String[] args) {
		// 객체생성
		MyQueue queue=new MyQueue();
		
		//요소추가-순서(A->B->C)
		queue.enQueue("A");
		queue.enQueue("B");
		queue.enQueue("C");
			
		//요소삭제-순서(A->B->C)
		System.out.println(queue.deQueue());		
		System.out.println(queue.deQueue());		
		System.out.println(queue.deQueue());		
		

	}

}
