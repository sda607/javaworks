package collection.member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

//DAO
public class memberHashMap {
	//hashMap 객체 생성
	Map<Integer, Member> hashMap = new HashMap<>();
	
	public memberHashMap() {
		hashMap = new HashMap<>();
	}
	
	//회원추가
	public void addMember(Member member) {
		//key:memberIdm value:member 로 저장
		hashMap.put(member.getmemberId(), member);
	}
	
	//회원 목록 보기
	public void showAllMember() {
		//반복자 객체 열기
		Iterator<Integer> ir = hashMap.keySet().iterator();
		while(ir.hasNext()) {
			int key = ir.next(); //key를 가져와서
			Member member = hashMap.get(key);//키로부터 value 가져옴
			System.out.println(member);
		}
	}
	
	//회원 삭제
	public boolean removeMember(int memberId) {
		if(hashMap.containsKey(memberId)) {
			hashMap.remove(memberId);
			return true;
		}
		System.out.println(memberId + "가 존재하지않습니다.");
		return false;
	}
}
