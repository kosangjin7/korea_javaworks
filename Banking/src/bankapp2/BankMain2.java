package bankapp2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import bankapp.BankAccount;

public class BankMain2 {

	// BankAccount 객체를 저장할 자료구조-ArrayList사용
	static List<BankAccount> accountList=new ArrayList<>();
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		
		boolean sw = true ;//실행과 종료 상태 변수
		
		while(sw) {
			System.out.println("====================================="); 
			System.out.println("1.계좌생성|2.계좌목록|3.예금 |4.출금 |5.종료"); 
			System.out.println("====================================="); 
			System.out.println("선택>"); 
			
			int selectNum=Integer.parseInt(scan.nextLine());
			
			if(selectNum == 1) {
				creatAccount();
			}else if(selectNum == 2) {
				getAccountList();}
			}else if(selectNum == 3) {
				deposit();
			}else if(selectNum == 4) {
				withdraw();
			}else if(selectNum ==5) {
				System.out.println("프로그램을 종료합닏.");
				sw=false;
			}else {
				System.out.println("지원되지 않는 기능입니다.");
			}
	}

	private static void withdraw() {
		// TODO Auto-generated method stub
		 System.out.println("====================================") ;
			System.out.println("             출금                  ");
			System.out.println("====================================");
			
			System.out.println("계좌번호:");
			String ano=scan.nextLine();//계좌입력  
			
			 
			
			if(findAccount(ano) !=null) {//일치되는 계좌번호가 있으면
				BankAccount account=findAccount(ano);
				while(true) {
					System.out.println("출금액:");
					int amount=Integer.parseInt(scan.nextLine()); 
				
				if(amount>account.getBalance()) {
					System.out.println("잔액이 부족합니다.다시 입력하세요");
				}
				//출금=잔고-입금액
				account.setBalance(account.getBalance()-amount);
				System.out.println("결과: 정상 출금되었습니다.현재잔액:"+account.getBalance());
				break;//while문 빠져나옴
				}
			}else {
				System.out.println("결과: 계좌가 없습니다.");
				}	
	}

	private static void deposit() {
		// TODO Auto-generated method stub
		  //예금
		   System.out.println("====================================") ;
			System.out.println("             예금                   ");
			System.out.println("====================================");
			
			System.out.println("계좌번호:");
			String ano=scan.nextLine();//계좌입력  
			
			System.out.println("입금액:");
			int amount=Integer.parseInt(scan.nextLine());  
			
			if(findAccount(ano) !=null) {
				BankAccount account=findAccount(ano);
				
				account.setBalance(account.getBalance()+amount);
				System.out.println("결과: 정상 입금되었습니다. 현재잔액:"+account.getBalance());
			}else {
				System.out.println("결과: 계좌가 없습니다.");
			}   		   		   
	}

	private static void getAccountList() {
		// TODO Auto-generated method stub
		//계좌목록
		for(int i=0;i<accounts.length;i++) {
			if(accounts[i] !=null) {
			System.out.println("계좌번호:"+accounts[i].getAno()+"\t");
			System.out.println("계좌주:"+accounts[i].getOwner()+"\t");
			System.out.println("잔액:"+accounts[i].getBalance()+"\n");
			}
		}
	}

	private static void creatAccount() {
		//계좌생성
		System.out.println("====================================") ;
		System.out.println("              계좌 생성               ");
		System.out.println("====================================");
		
		System.out.println("계좌번호:");
		String ano=scan.nextLine();//계좌입력
		
		System.out.println("계좌주:");
		String owner=scan.nextLine();//계좌입력
		
		System.out.println("초기입금액:");
		int balance=Integer.parseInt(scan.nextLine());//계좌입력

		
		//첫번째 위치에 계좌생성
		//accounts[0]=new BankAccount(ano,owner,balance);
		for(int i=0;i<account.length;i++) {
			if(account[i] == null) {//배열의 요소가 비어있는 경우
				account[i]=new BankAccount(ano,owner,balance);
			System.out.println("결과:계좌가 생성되었습니다.");
			break;
		}
		}
		
		System.out.println("결과:계좌가 생성되었습니다.");
	}
	
	}
			
	 















