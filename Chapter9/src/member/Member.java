package member;
//Member 클래스(참조자료형)만들기
public class Member {
	
	private int memberId;
	private String memberName;
	
	public  Member(int memberId , String memberName) {
		this.memberId=memberId;
		this.memberName=memberName;	
	}
	
	public void setMemberId(int memberId) {
		this.memberId=memberId;
	}
	public void getMemberId(String memberName) {
		this.memberName=memberName;
	}

	@Override
	public String toString() {
		return memberName+"회원님의 아이디는"+memberId+"입니다.";

	}
}
