package collection.member;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//Dao 생성
public class MemberHashset {

	private Set<Member> hashSet;
	
	public MemberHashset() {
		hashSet = new HashSet<>();
	}
	
	//회원추가
	public void addMember(Member member) {
		hashSet.add(member);
	}
	
	//회원 목록 보기
	public void showAllMember() {
		for(Member member : hashSet) {
			System.out.println(member);
		}
		
		
		//반복자 객체 얻기
//		Iterator<Member> ir = hashSet.iterator();
//		while(ir.hasNext()) {//자료가 있으면 (true)설명
//			Member member = ir.next();//1개의 객체 가져와서
//			System.out.println(member);
//		}
	}
	//회원 삭제
	public boolean removeMember(int memberId) {
		Iterator<Member> ir = hashSet.iterator();
		while(ir.hasNext()) {
			Member member = ir.next();
			int dbMemberId = member.getmemberId();//이미 저장된 id를 가져옴
			if(dbMemberId == memberId) {//외부 입력 memberId와 같으면
				hashSet.remove(member);	//멤버 객체 삭제
				return true;
			}
		}
		System.out.println(memberId + "가 존재하지않습니다.");
		return false;
	}
}
	
