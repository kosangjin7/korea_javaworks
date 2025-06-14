package threads.print_beep;

import java.awt.Toolkit;

public class BeepTask implements Runnable {

	@Override
	public void run() {

		//"띵" 소리 5번 재생하기
				Toolkit toolkit = Toolkit.getDefaultToolkit();
				for(int i=1;i<=5;i++) {
					toolkit.beep();//소리재생 메서드 호출
					try {
						Thread.sleep(500);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
	}

}
