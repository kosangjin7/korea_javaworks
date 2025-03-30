 package loop;

public class ForEx1 {

	public static void main(String[] args) {
		//for(초기값;종료값;증감값)
		// 1~10까지 출력
		
		for(int n=1; n<=10; n++) {
			System.out.print(n + " ");
		}
		
		System.out.println();
		
		//1~10까지의 합계와 평균
		int total=0;
		double avg;
		int n;
		for( n=1; n<=10; n++) {
			total +=n;
		}
		//평균
		avg=(double)total /(n-1);
		
		System.out.println("합계:"+total);
		System.out.println("평균:"+ avg);
		

	}

}
