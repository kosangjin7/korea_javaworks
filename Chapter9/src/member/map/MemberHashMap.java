package member.map;

import java.util.HashMap;
import java.util.Iterator;

import member.Member;

//자료관리 클래스
public class MemberHashMap {
	//자료구조와 객체선언
	HashMap<Integer,Member> hashMap;
	
	public MemberHashMap() {
		hashMap=new HashMap<>();
	}
		
	
	public void addMember(Member member) {
		hashMap.put(member.getMemberId() ,member);
	}
	
	public void showAllMember() {
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key=ir.next();
			Member member=hashMap.get(key);
			System.out.println(member);
		}
		System.out.println();
		
		
	}
	//회원삭세
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
		}
		
	}
		
	
}
