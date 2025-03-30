package loop;

import java.util.Scanner;

public class CoffeeMachine {

	public static void main(String[] args) {
		// 커피자동판매기
		int coffee =5;//커피총수량
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.print("돈을 넣어주세요:");
			int money = scan.nextInt();
			if(money == 500) {
				System.out.println("커피가 나옵니다.");
				coffee  -= 1;
				
			}else if(money > 500) {
				System.out.println("커피가 나오고"+"거스름돈"+(money+500)+"원을 돌려줍니다.");
				coffee -=1;
			}else {
				System.out.println("커피가 나오지 않고, 돈을 돌려줍니다.");
			}
			
			System.out.println("남은 커피의 양은" + coffee + "입니다.");
			
			if(coffee == 0) {
				System.out.println("커피가 모두 소진되었어요. 판매를 중단합니다.");
				break;
			}//while 종료
		}
		scan.close();
		
				
	}
}
