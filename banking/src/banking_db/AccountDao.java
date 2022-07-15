package banking_db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import banking_db.common.JDBCUtill;

public class AccountDao {
	
	//JDBC 관련 변수 선언
	private Connection conn = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs= null;
	private Scanner scanner = new Scanner(System.in);
	
	
	//계좌생성
	public void createAccount();{
		
	}
	
	//목록 보기
	public List<Account> getAccountList(){
		List<Account> accountList = new ArrayList<>();
		
		
		System.out.println("---------------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("---------------------------------------------");
		
		//db연결
		conn = JDBCUtill.getConnection();
		String sql = "SELECT * FROM account";
		pstmt = conn.prepareStatement(sql);
		pstmt.executeQuery();
		
		System.out.print("계좌번호 : " + account.getAno() + "\t");
		System.out.print("계좌번호 : " + account.getOwner() + "\t");
		System.out.println("잔액 : " + account.getBalance() + "\t");
		
		
		return accountList;
	}
}
