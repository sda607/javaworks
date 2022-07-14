package collection.member;

import java.util.ArrayList;

public class MemberArrayList {

	private ArrayList<Member>arrayList;
	
	public MemberArrayList() {
		arrayList = new ArrayList<>();
	}
	
	//회원 추가 매서드
	public void addMember(Member member){ //Member member = new Member(**,"00")
		arrayList.add(member);
	}
	
	//회원 전체 조회
	public void showAllMember() {
		for(int i=0; i<arrayList.size(); i++) {
			Member member = arrayList.get(i);
			System.out.println(member);
		}
	}
	//회원 삭제
	public boolean removeMember(int memberId) {
		for(int i=0; i<arrayList.size(); i++ ) {
			Member member =arrayList.get(i);
			int dbMemberId = member.getmemberId();//이미저장된 회원아이디
			if(dbMemberId == memberId) {// 저장 id와 외부입력한 id가 같으면
				arrayList.remove(i);	//\i번째 객체 삭제
				return true;
			}
		}
		
		System.out.println(memberId + "가 존재하지않습니다.");
		return false;
	}
}
