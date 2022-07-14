package collection.member;
//VO(Value object - 객체자료)
public class Member {
	private int memberId;	//회원 아이디
	private String memberName; 	//회원 이름
	
	//생성자
	public Member(int memberId, String memberName) {
		this.memberId = memberId;
		this.memberName = memberName;
	}
	
	public void setmemberId(int memberId) {
		this.memberId = memberId;
	}
	
	public int getmemberId() {
		return memberId;
	}
	public void setmemberName(String memberName) {
		this.memberName = memberName;
	}
	public String getmemberName() {
		return memberName;
	}

	@Override
	public String toString() {
		return memberName + "회원의 아이디는" + memberId;
	}

	@Override
	public int hashCode() {
		return memberId;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Member) {
			Member member = (Member)obj;
			if(this.memberId == member.memberId) {
				return true;
			}
		}
		return false;
	}
	
}
