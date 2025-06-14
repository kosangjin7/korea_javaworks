package lambda;

public class StringConcatTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="자바";
		String str2="프로그램";
		StringConcat concat;
		
		concat =(s,v) -> System.out.println(s+","+v);
		concat.makeString(str1, str2);
	}

}
