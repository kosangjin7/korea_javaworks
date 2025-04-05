package chap3;

public class Sum100 {

	public static void main(String[] args) {
//1부터 더했을때 그 합이 100이 넘는 자연수와 합계
	//[파일이름:Sum100.java]
		
		int n=1;
		int sum=0;
				
		while(true) {
			sum += n;
			if(sum>100)break;
			n++;
		}
		System.out.println("n="+n);
		System.out.println("sum="+sum);
		
		
	}

}
