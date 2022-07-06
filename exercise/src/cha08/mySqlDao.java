package cha08;

public class mySqlDao implements DataAccessObject{

	@Override
	public void selcect() {
		System.out.println("MySql DM에서 검색");
		
	}

	@Override
	public void insert() {
		System.out.println("MySql DM에서 삽입");
		
	}

	@Override
	public void update() {
		System.out.println("MySql DM에서 수정");
		
	}

	@Override
	public void delete() {
		System.out.println("MySql DM에서 삭제");
		
	}

}
