package banking;

import java.util.Scanner;

public class BankMain {

	public static void main(String[] args) {
		//은행업무 프로그램-예금,출금,잔액조회
		
		Scanner sc=new Scanner(System.in);
		boolean run=true;
		int balance=0;//잔고
		
		while(run) {
		//메뉴화면
		System.out.println("================================");
		System.out.println("1.예금| 2.출금| 3.잔액조회| 4.종료");
		System.out.println("================================");
		System.out.printf("선택>");
		
		int selectNum=sc.nextInt();//선택메뉴
		int amount=0;//입금,출금액
		switch(selectNum) {
		case 1:
			System.out.println("예금액>");
			amount=sc.nextInt();
			balance += amount;//balance=balance+amount;
			System.out.println("정상 입금되었습니다. 현재 잔액:"+ balance);
			break;
		case 2:
			System.out.println(" 출금액>");
			amount=sc.nextInt();
			if(amount > balance) {
				System.out.println("잔액부족입니다. 다시입력하세요.");
				break;
			}else {
				
			balance -= amount;//balance=balance+amount;
			System.out.println("정상 출금되었습니다. 현재 잔액:"+ balance);
			
			break;
			}
		case 3:
			System.out.println(" 잔액>"+balance);
			break;
		case 4:
			System.out.println("프로그램을 종료합니다.");
			run=false;
			break;
			default:
				System.out.println("메뉴를 잘못 눌렀습니다. 다시 선택해 주세요");
		}
		
		
		}
		
		}

	}


