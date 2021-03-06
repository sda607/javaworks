package banking_array;

import java.util.Scanner;

import banking_arrayList.Account;

public class Main {
	//배열의 크기가 100인 Account 형 배열 선언
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		boolean run = true; 	//실행 변수
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4. 출금 |5. 종료");
			System.out.println("---------------------------------------------");
			System.out.println("선택> ");
			
			String selectNo = scanner.next(); //nextLine() 자동 줄바꿈
			if(selectNo.equals("1")) {
				createAccount(); //계좌생성
			}else if(selectNo.equals("2")) {
				accountList();
			}else if(selectNo.equals("3")) {
				deposit();
			}else if(selectNo.equals("4")) {
				withdraw();
			}else if(selectNo.equals("5")) {
				run = false;
			}else {
				System.out.println("지원되지않는 기능");
			}
		}//while닫기
		System.out.println("프로그램종료");
	}


	private static void createAccount() {
		System.out.println("---------------------------------------------");
		System.out.println("1.계좌생성");
		System.out.println("---------------------------------------------");
		while(true) {
			System.out.print("계좌 번호: ");
			String ano = scanner.next();
			if(findAccount(ano) != null) {
				System.out.println("중복 계좌입니다. 다시 입력하세요");
			}else {
				System.out.print("계좌주: ");
				String owner = scanner.next();//숫자
				while(true) {
					System.out.println("초기입금액 :");
					int balance = scanner.nextInt();
					if(balance < 100) {
						System.out.println("초기 입금액은 100원 이상입니다. 다시 입력하세요");
					}else {
						//계좌 객체 생성
						Account newAccount = new Account(ano, owner, balance);
						for(int i=0; i<accountArray.length; i++) {
							if(accountArray[i] == null) { //배열의 공간이 null인 경우
								accountArray[i] = newAccount;//계좌를 배열에 저장
								System.out.println("결과: 계좌가 생성되었습니다.");
								break;
								}
							}
							break;
						}
					}//안쪽 while
					break;
				}
			}//바깥쪽 while
		}


	private static void accountList() {
		System.out.println("---------------------------------------------");
		System.out.println("계좌 목록");
		System.out.println("---------------------------------------------");
		
		for(int i=0; i<accountArray.length; i++) {
			Account account = accountArray[i];	//배열에 저장된 account를 반환
			if(account != null) {
				System.out.print("계좌번호 : " + account.getAno() + "\t");
				System.out.print("계좌번호 : " + account.getOwner() + "\t");
				System.out.println("잔액 : " + account.getBalance() + "\t");
			}
		}
	}


	private static void deposit() {
		System.out.println("---------------------------------------------");
		System.out.println("예금");
		System.out.println("---------------------------------------------");
		
		while(true) {
		System.out.print("계좌 번호: ");
		String ano = scanner.next();
		//계좌가 없습니다.
		if(findAccount(ano) == null) {
			System.out.println("계좌가 없습니다");
			System.out.println("계좌번호 :");
			ano = scanner.next();
		}else {
				Account account = findAccount(ano);
				while(true) {
				System.out.print("입금액: ");
				int money = scanner.nextInt();
				if(money > account.getBalance()) {
					System.out.println("잔액이 부족합니다.");
					}else if(money < 0) {
						System.out.println("음수를 입력할 수 없습니다.");
					}else {
						account.setBalance(account.getBalance()  + money);
						System.out.println("결과: 입금을 성공하였습니다.");
						break;
						}
				}
			}//안쪽 while
		}	
	}//바깥 while닫기


	private static void withdraw() {
		System.out.println("---------------------------------------------");
		System.out.println("출금");
		System.out.println("---------------------------------------------");
		
	
			System.out.print("계좌 번호: ");
			String ano = scanner.next();
			
			Account account = findAccount(ano);
			
			System.out.print("출금: ");
			int money = scanner.nextInt();
			
			account.setBalance(account.getBalance()  - money);
			System.out.println("결과: 출금을 성공하였습니다.");
		}
	

	private static Account findAccount(String ano) {
		Account account = null;
		for(int i=0; i<accountArray.length; i++) {
			if(accountArray[i] != null) {
				String dbAno = accountArray[i].getAno(); //저장된 계좌를 가져와서
				if(dbAno.equals(ano)) {   //이미 저장된 계좌와 새로 입력한 계좌가 일치한다면
					account = accountArray[i];
					break;
				}
			}
		}
		return account;
	}

}

