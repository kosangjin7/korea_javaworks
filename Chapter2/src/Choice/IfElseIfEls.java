package Choice;

import java.util.Scanner;

public class IfElseIfEls{
/*
 * @ 학점 계산 프로그램
 * 90~100점:A
 * 80~89점:B
 * 70~79점:C
 * 70점 미만:F 
 * 
 */
	public static void main(String[] args) {
		//다중조건문
		//논리 연산사 &&,||,!
		
		Scanner scan = new Scanner(System.in);
				
//		int score=86;
		System.out.print("점수를 입력하세요:");
		int score = scan.nextInt();
		char grade=' ' ;
		
		if(score >=90 && score <= 100) {
					grade ='A';
		}else if (score >=80 && score <90) {
				grade = 'B';
		
		}else if (score >=70 && score <80) {
			grade = 'C';
			
		}else {
			grade ='F';
		}
		System.out.println("학점은 " + grade + "입니다.");
		
	}
}
