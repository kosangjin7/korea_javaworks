package array2d;

public class MyAbs {
	public static int myAbs(int x) {
		if(x<0)
			return -x;
		else
			return x;
	}

	public static void main(String[] args) {
		//myAbs(-4)=4
		//myAbs(4)=4
		int value1=myAbs(-4);
		int value2=myAbs(4);
		
		System.out.println("myAbs(-4)="+value1);
		System.out.println("myAbs(4)="+value2);
		

	}

}
