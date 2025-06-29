package random;

import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		/*
		 * 숫자 추측 게임
		 * 1.컴퓨처가 난수를 생성함(1~30)
		 * 2.사용자가 추측한 수 입력
		 * 3.추측한 수와 컴퓨터 나수가 일치하면"정답"
		 *   추측한 수가 크면"너무커요",아니면"너무작아요"출력
		 * 4.숫자 범위를  초과하면"범위를 멋어났습니다. 다시 입력해 주세요"		
		 *  */
		Random rnd=new Random();
		Scanner sc=new Scanner(System.in);
		
		//컴퓨터 난수 생성
		int com=rnd.nextInt(30)+1;
		
		while(true) {
			System.out.println("숫자를 입력하세요(1~30):");
			int you = sc.nextInt();
			
			if(you <1 || you >30) {
				System.out.println("범위 벗어났습니다. 다시 입력해주세요");
			}
			else if(you == com) {
				System.out.println("정답");
				break;
			}
			else if(you > com) {
				System.out.println("너무 커요");
			}
			else {
				System.out.println("너무 작아요");
				
			}
		}
		sc.close();
	}

}
