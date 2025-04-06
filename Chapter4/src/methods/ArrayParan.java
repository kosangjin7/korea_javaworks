package methods;

public class ArrayParan {
	 
	//배열의 합계를 계산하는 함수 정의 
	public static int add(int[] score) {
		int sum=0;//합계 저장변수
		for(int i=0; i<score.length;i++) {
			sum +=score[i];
		}
		return sum;
	}

	public static void main(String[] args) {
		// 메서드의 매개 변수로 배열을 전달
		int[] numbers= {1,2,3,4};
		int total= add(numbers);
		System.out.println("합계:"+total);
	}

}
