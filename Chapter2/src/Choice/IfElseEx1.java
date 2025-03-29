package Choice;

import java.util.Scanner;

public class IfElseEx1 {

	public static void main(String[] args) {
		// 조건문 - If문
		//나이가 15세 이상이면 "관람가"출력
		//int age = 14;
	     Scanner scan = new Scanner(System. in);	
		 System.out.println("나이를 입력하세요");
	     int age = scan.nextInt();
	     
	     
	//	if(age >= 15) {
	//		System.out.println("관람가");
	//	}
	
		//System.out.println("나이는"+ age + "세 입니다.");

		if(age >= 15) {
			System.out.println("관람가");
		}else {
			System.out.println("관람불가");
		}
		
		System.out.println("나이는"+ age + "세 입니다.");

		scan.close();
	}	

}
