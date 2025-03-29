package loop;

public class WhileEx2 {

	public static void main(String[] args) {
		// 반복문 - 초기값, 종료값, 증감값
		int n = 1;//초기값
		
		/*while(n <= 10) {
						
		System.out.println("Hello~" + n);
		n++;
		
		}*/
		
		int sum = 0;
		while(n <=10) {
			sum += n;
			System.out.println("n=:" + n + "sum=:" + sum); 
			n++;
		}
		
		    System.out.println("합계:" + sum);
	}
}
