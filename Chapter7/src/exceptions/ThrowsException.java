package exceptions;

public class ThrowsException {
	public static void main(String[] args) {
			try {
				findClass();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
				System.out.println("예외처리:"+e.toString());
			}
	
	}

	public static void findClass() throws ClassNotFoundException {
		Class.forName("java.lang.Math2");
	}
}
