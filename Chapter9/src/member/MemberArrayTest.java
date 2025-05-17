package member;

public class MemberArrayTest {

	public static void main(String[] args) {
		//ArrayList를 활용한 회원관리프로그램
		
		// 객체생성
		Member lee=new Member(1001,"이정후");
		Member shin=new Member(1002,"신유빈");
		Member choi=new Member(1003,"최민정");
		
		System.out.println(lee);
		
		MemberArrayList memberArrayList=new MemberArrayList();
		memberArrayList.addMember(lee);
		memberArrayList.addMember(shin);
		memberArrayList.addMember(choi);
		
		memberList. showAllMember();
		System.out.println("====================================");
		
		memberList.removeMember(1002);
		memberList.removeMember(1004);
		
		memberList.showAllMember();

	}

}
