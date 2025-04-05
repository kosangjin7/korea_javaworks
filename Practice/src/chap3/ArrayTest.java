package chap3;

public class ArrayTest {

	public static void main(String[] args) {
		/*배열 길이가 5인 정수 배열을 선언하고,1~10중 짝수만을 배열에저장한후 
		 * 그 합과 평균을 곙산하세요
		 */
		
		int[] arr= {2,4,6,8,10};
				
		int total=0;
		double avg;
		for(int i=0; i<arr.length; i++) {
			//total=total+number[i];
			total +=arr[i];
			
			avg=(double)total/arr.length;
			
		}
		
		System.out.println("합계:"+total);
		System.out.println("평균:"+ avg);
		System.out.println();
		
		
		
	}

}
