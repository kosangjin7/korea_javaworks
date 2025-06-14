package interface_imple;

public class MyMathImpl implements MyMath {

	@Override
	public int myAbs(int n) {

		//int value = (n<0 ? -n: n);
		//return value;
		if(n<0) {
			return -n;
		}else {
			return n;
		}
	}

	
}
