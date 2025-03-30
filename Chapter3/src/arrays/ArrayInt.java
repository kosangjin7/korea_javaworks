package arrays;

public class ArrayInt {

	public static void main(String[] args) {
		// 배열-여러개의 연속된 자료를 저장하는 자료 구조이다.
		//배열이 길이가 4인 정수형 배열 선언
		///int[] number = new int[4];
		//System.out.println(number[0]);
		
		//for(int i=0; i<4; i++ ) {
		//	System.out.println(number[i]);
			
		/*number[0]=10;
		number[1]=20;
		number[2]=30;
		number[3]=40;*/
		
		
		//방법2- 배열의 선언과 동시에 초기화
		
		int[] number =  {10,20,30,40,50};
		System.out.println("배열의 길이:"+ number.length);
		
		//요소 수정
		number[2]=100;
		//전체출력
		for(int i=0; i<number.length; i++) {
			System.out.print(number[i]+" ");
		}
		
		System.out.println();
		
		//연산
		System.out.println(number[0]+number[1]);
		
		//전체합계
		int total=0;
		for(int i=0; i<number.length; i++) {
			//total=total+number[i];
			total +=number[i];
		}
		
		System.out.println("합계:"+total);
		System.out.println("평균:"+(double)total/number.length);
		System.out.println();
		
		}
		
	
		
	}


