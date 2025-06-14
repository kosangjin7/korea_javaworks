package threads.print_beep;

public class PrintBeepTest2 {

	public static void main(String[] args) {
		// 메인스레드 작업 스레드(소리재생)가 동시에 실행
		//자동 형변환(인터페이스 행으로 객체 생성)
		Runnable beepTask =new BeepTask();
		Thread thread =new Thread(beepTask);
		thread.start();
		
		// "띵"문자 5번 출력하기
		//메인스레드 실행

		for(int i=1;i<=5;i++) {
			System.out.println("띵");
			//시간 대기 메서드-
			try {
				Thread.sleep(500);//1초 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}
