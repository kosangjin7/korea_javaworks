package schedule;

import java.io.IOException;

public class SchedulerTest {
	public static void main(String[] args) throws IOException {
		//입력 처리 -System.in.read()을 사용
		
		
		
		
		//메뉴만들기
		System.out.println("전화상담 배분 방식을 선택하세요:");
		System.out.println("R: 한 명씩 차례로 배분");
		System.out.println("L: 대기가 가장 적은 상담원에게 배분");
		System.out.println("P: 우선순위 높은 고객에게 먼저 배분");
		
		int ch=System.in.read();//1개의 문자 입력
		Scheduler scheduler=null;
		if(ch == 'R'|| ch == 'r') {
			scheduler=new RoundRobin();
		}else if(ch == 'L'|| ch == 'l'){
			scheduler=new LeastJob();
		}else if(ch == 'P'|| ch == 'p'){
			scheduler=new PriorityAllocation();
		}else {
			System.out.println("지원되지 않는기능");
			return;
		}
		scheduler.getNextCall();//메서드 호출
		scheduler.sendCallToAgent();
		
	}

}
