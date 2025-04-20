package chap5;

public class MemberTest {

	public static void main(String[] args) {
		// 
		Member[] members=new Member[3];
		
		members[0] =new Member("정은하","j1234");
		members[1] =new Member();
		members[2] =new Member();
		
		System.out.println("**********회원현황**********");
		for(int i=0;i<members.length;i++)
			members[i].showMemberInfo();
		
		System.out.println("=======================");
		
		//향상된 for 문
		//for(자료형변수: 배열이름){변수이름 출력}
		
	}

}
