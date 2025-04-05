package arrays;

import java.util.Scanner;

public class CalcScore {

	public static void main(String[] args) {
		//성적처리 프로그램-사용자 입력방식
		boolean run=true;
		int studentNum=0;
		int[]scores=null;
		Scanner sc=new Scanner(System.in);
		
		while(run) {
			System.out.println("=======================================");
			System.out.println("1.학생수| 2.정수입력|3.정수리스트|4.분석|5.종료");
			System.out.println("=======================================");
			System.out.print("선택> ");
			
			int menu=sc.nextInt();
			switch(menu) {
			case 1:
				System.out.print("학생수>");
				studentNum=sc.nextInt();//학생수 입력
				scores=new int[studentNum];//
			case 2:
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]>");
					scores[i]=sc.nextInt();
				}
				break;
			case 3:
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores["+i+"]="+scores[i]);
				}
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
			         run=false;
			         break;
			         default:
			        	 System.out.println("잘못된 선택입니다. 다시 입력하세요.");
			        	 break;
			}
			
		}
		sc.close();

	}

}
