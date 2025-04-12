package constant;

public class ConstantEx {

	public static void main(String[] args) {
		// 상수-변하지 않는 값을 저장(변수와 상대됨)
		//final키워드ㅏ용, 대문자 사용
		final int MIN_NUM=0;
		final int MAX_NUM=100;
		//MIN_NUM=1;//변경불가
		
		//원주율-파이(상수)
		final double PI=3.1415;
		int radius=5;
		double area;
		
		area=PI*radius*radius;
		
		System.out.println(PI);
		System.out.printf("원의 넓이:%.2f\n",area);
		

	}

}
