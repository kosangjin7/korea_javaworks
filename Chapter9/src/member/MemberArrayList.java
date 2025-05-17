package member;

import java.util.ArrayList;

//회원을 관리(추가,조회,삭제)하는 클래스
public class MemberArrayList {
	//ArrayList자료구조 선언
	private ArrayList<Member> arrayList;
	
	public MemberArrayList() {
		arrayList=new ArrayList<>();		
	}
	
	public void addMember(Member member) {
		arrayList.add(member);
	}
	
	public void showAllMember() {
		for(int i=0;i<arrayList.size();i++) {
		Member member=arrayList.get(i);
		System.out.println(member);
		}
	}
	
	public void removeMember(int member) {
		String memberId;
		for(int i=0;i<arrayList.size();i++) {
			
			int dbId=arrayList.get(i).getMemberId();
			if(dbId == memberId) {
				arrayList.remove(i);
				return true;
			}
			
		}
		System.out.println(memberId+"가 존재하지 않습니다.");
		return false;
	}

}
