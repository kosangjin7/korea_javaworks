package threads.print_beep;

import java.awt.Toolkit;

public class PintBeepTest {

	public static void main(String[] args) {
		// "띵"문자 5번 출력하기

		for(int i=1;i<=5;i++) {
			System.out.println("띵");
			//시간 대기 메서드-
			try {
				Thread.sleep(1000);//1초 
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		//"띵" 소리 5번 재생하기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i=1;i<=5;i++) {
			toolkit.beep();//소리재생 메서드 호출
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
