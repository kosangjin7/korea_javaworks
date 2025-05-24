package regexp;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExpTest {

	public static void main(String[] args) {
		// 정규식 표현식-compile("a*b"):a가0번 이상 반복
		//compile(a*b) :a가0번이상 반복
		//compile(a+b) :a가1번이상 반복
		Pattern pat =Pattern.compile("a+b");
		
		Matcher mat=pat.matcher("aaab");
		boolean result=mat.matches();
		
		System.out.println(result);//true
		//숫자만 허용하는 패턴 검사
		String pattern="^[0-9]$";
		String str="abc1234";
		
		boolean result2=Pattern.matches(pattern, str);
		System.out.println(result2);
		
		//한글이름과 전화 번호 패턴 검사
		String name="제갈수현";
		String tel="010-1234-5678";
		
		boolean name_check=Pattern.matches("^[가-힣]{2,5}$", name);
		boolean tel_check=Pattern.matches("^010[-](\\d{3}|\\{4})[-]\\d{4}$", tel);
					
		System.out.println("이름검사:"+name_check);
		System.out.println("전화번호:"+tel_check);
		//한글 이름 패턴 유효성 검사
		Scanner sc=new Scanner(System.in);
		System.out.println("한글 이름을 입력하세요:");
		String inputName=sc.nextLine();
		
		if(!Pattern.matches("[가-힣]{2,5}", inputName)) {
			System.out.println("올바른 한글 이름이 아닙니다.");
		}
		System.out.println("이름:"+inputName);
		
		sc.close();
		
		
		
		
	}

}
