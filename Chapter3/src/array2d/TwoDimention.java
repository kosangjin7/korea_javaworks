package array2d;

public class TwoDimention {

	public static void main(String[] args) {
		// 정수형2차원 배열
	/*	int[][]a=new int[2][3];
		
		System.out.println(a.length);
		
		System.out.println(a[0].length);
		System.out.println(a[1].length);
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		a[0][0]=1;
		a[0][1]=2;
		a[0][2]=3;
		a[1][0]=4;
		a[1][1]=51;
		a[1][2]=6;
		*/
		
		int[][] a= {
				{1,2,3},
				{4,5,6}
		};
		
		for(int i=0;i<a.length;i++){
			for(int j=0;j<a[i].length;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}

}
