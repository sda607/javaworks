package cha08;

public class DaoEx {

	public static void dbWork(DataAccessObject dao) {
		
		dao.selcect();
		dao.insert();
		dao.update();
		dao.delete();
	}

	public static void main(String[] args) {
		dbWork(new OracleDao());
		dbWork(new mySqlDao());
	}
}
