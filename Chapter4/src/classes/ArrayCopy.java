package classes;

public class ArrayCopy {

	public static void main(String[] args) {
		// 정수형 배열복사
		int[]arr1= {
				1,2,3,4
		};
		
		int[]arr2=new int[4];
		//인덱싱
		System.out.println(arr1[0]);
		System.out.println(arr1[3]);
		
		
		//전체출력
		System.out.println("***arr1출력***");
		for(int i=0;i<arr1.length;i++) {
			System.out.println(arr1[i]+" ");
		}
		
		System.out.println(arr2[0]);
		//arr1을 arr2에 복사하기
		arr2[0]=arr1[0];
		System.out.println(arr2[0]);
		
		
		for(int i=0;i<arr1.length;i++) {
			arr2[i]=arr1[i];
		}
		System.out.println("***arr2출력***");

	}

}
