package interface_imple;

public class StringConcatImple implements StringConcat{

	@Override
	public void makeString(String s1, String s2) {

		System.out.println(s1+","+s2);
	}

}
