package operator;

public class OperatorEx2 {

	public static void main(String[] args) {
		System.out.println("*** 비교연산**");
		//"
		int n1 = 10, n2 = 20;
		
		System.out.println(n1 >= n2);
		System.out.println(n1 <= n2);
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		
		
		System.out.println("*** 논리연산**");
		System.out.println((n1 <= n2) && (n1 == n2) );
		System.out.println((n1 <= n2) || (n1 == n2) );
		System.out.println(!(n1 == n2) );
		
		System.out.println("*** 복합 대입 연산 **");
		int num3 = 10;
		
		
		System.out.println(num3 +=  2);
		System.out.println(num3 -=  2);
		System.out.println(num3 *=  2);
		System.out.println(num3 /=  2);
		System.out.println(num3 %=  2);
		
		System.out.println("*** 조건 연산 **");
		//부모 나이 비교-아빠 나이가 엄마 나이보다 크면 결과
		//1. 결과값-'T','F'
		int fatherAge = 55;
		int motherAge = 57;
		
		char result1;
		
		boolean result2;
		
		String result3;
		
		result1 = (fatherAge > motherAge) ? 'T' : 'F';
		System.out.println(result1);
		
		result2 = (fatherAge > motherAge) ? true : false;
		System.out.println(result2);
		
		result3 = (fatherAge > motherAge) ?"아빠가 연상" :"엄마가 연상";
		System.out.println(result3);
	}

	}


