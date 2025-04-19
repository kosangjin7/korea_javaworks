package array2d;

public class CalcArray {

	public static void main(String[] args) {
		//2차원 정수형 배열
		int[][]numbers= {
				{1,2,3,4},
				{5,6,7}
			};
		int sum=0;
		int count=0;
		double avg=sum/count;
		
		//특정 요소검색
		int x = numbers[1][1];
		System.out.println(x);
		
		//전체검색
		for(int i=0;i<numbers.length;i++) {
			
			for(int j=0;j<numbers[i].length;j++) {
				System.out.print(numbers[i][j]+"  ");
			}
			
			System.out.println();
			//배열의 크기
			System.out.println("배열의 크기:"+numbers.length);
			
			//요소의 합계
			for(int i=0; i<numbers.length; i++) {
				
				for(int j=0;j<numbers[i].length;j++) {
					sum +=numbers[i][j];
					count++;
				}	
			
		}
			//평균			
			avg=(double)sum/count;
			System.out.println("함계:"+sum);
			System.out.println("평균:"+avg);
			System.out.printf("평균: %.1f",avg);
			
	}

}
