package member.map;

import member.Member;

public class MemberMapTest {

	public static void main(String[] args) {
		//객체 생성
		MemberHashMap memberMap=new MemberHashMap();
		
		//회원추가
		 memberMap.addMember(new Member(1001, "삼성전자"));
		 memberMap.addMember(new Member(1002, "LG전자"));
		 memberMap.addMember(new Member(1003, "네이버"));
		 
		 //회원목록조회

		 memberMap.showAllMember();
		 //회원삭제
		 memberMap.removeMember(1001);
		 memberMap.removeMember(1004);
		 
		 memberMap.showAllMember();
	}

}
