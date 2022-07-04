package chap06;

public  class MemberService {

	public static void main(String[] args) {}
	boolean login(String id, String password) {
		if(id.equals("hong") && password.equals("12345")) {
			return true;
		}else {
			return false;
		}
		
		}
	void logout(String id) {
		System.out.println("로그아웃되었습니다.");
	}
}
