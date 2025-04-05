package nestedfor;

import java.util.Scanner;

public class Seats {

	public static void main(String[] args) {
/*
 * 입장객 수에 따른 좌석열과 줄을 만들어
 * 자리배치하는 프로그램
 * 입장객수와 좌석열이 나누어 떨어지는    않는 경우 */
		
		Scanner sc= new Scanner(System.in);
		System.out.print("입장객 수 입력:");
		int customer=sc.nextInt();
				
		System.out.print("좌석 열 입력:");
		int column=sc.nextInt();
		int row;
		
//	    int customer=22;17
		
//		int column=5;
//		int row;
		
		
		if(customer % column == 0) {
			row =(int)customer / column;
		}else {
			row =(int)(customer / column)+1;
		}
		
//		System.out.println(row);
		
		//자리배치도(행,열)
		System.out.println("=====자리배치도======");
		for(int i=0; i<=row; i++) {
			for(int j=1; j<=column; j++) {
				int seat=i*column+j;
				if(seat > customer) break;
				System.out.print("좌석"+seat +" ");
			}
			System.out.println();
		}
		
		
	}

}
