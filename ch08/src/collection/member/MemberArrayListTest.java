package collection.member;

import java.util.ArrayList;

public class MemberArrayListTest {
//DAO(Data Access Object)
	public static void main(String[] args) {
		MemberArrayList memberArrayList = new MemberArrayList();
		
		
		
		//회원 생성 및 추가
		Member Chu = new Member(1001, "추신수");
		memberArrayList.addMember(Chu);
		
//		memberArrayList.addMember(new Member(1001, "추신수"));
//		memberArrayList.addMember(new Member(1002, "홍명보"));
//		memberArrayList.addMember(new Member(1003, "김우빈"));
//		memberArrayList.addMember(new Member(1004, "최지원"));
		
		//회원 조회
		memberArrayList.showAllMember();
		
		//회원 삭제
		memberArrayList.showAllMember();
	}
	
	
}
