import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BankSystem bankSystem = new BankSystem();
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("=======================");
			System.out.println("한국은행에 오신 걸 환영합니다.");
			System.out.println("실행할 메뉴 번호를 입력하세요.");
			System.out.println("1= 계좌 생성");
			System.out.println("2= 계좌 확인");
			System.out.println("3= 잔액확인");
			System.out.println("4= 입금");
			System.out.println("5= 출금");
			System.out.println("0= 프로그램 종료");
			System.out.print("번호를 입력하세요= ");
			int input = scn.nextInt();

			if (input == 0) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			if (input == 1) {
				System.out.println("=======================");
				System.out.println("계좌생성메뉴입니다.");
				System.out.println("아래에 이름과 계좌번호를 입력하세요.");
				System.out.print("이름: ");
				String name = scn.next();
				System.out.print("계좌번호: ");
				int account = scn.nextInt();

				bankSystem.createAccount(name, account);
				
			} else if (input == 2) {
				System.out.println("=======================");
				System.out.println("계좌확인 메뉴입니다.");
				System.out.println("계좌번호를 입력하세요.");
				System.out.print("계좌번호: ");
				int account = scn.nextInt();

				bankSystem.retriveAccount(account);
				
			} else if (input == 3) {
				System.out.println("=======================");
				System.out.println("잔액조회 메뉴입니다.");
				System.out.println("아래에 이름과 계좌번호를 입력하세요.");
				System.out.print("이름: ");
				String name = scn.next();
				System.out.print("계좌번호: ");
				int account = scn.nextInt();

				bankSystem.retrieveBalance(account);
				
			} else if (input == 4) {
				System.out.println("=======================");
				System.out.println("입금 메뉴입니다.");
				System.out.println("아래에 이름과 계좌번호를 입력하세요.");
				System.out.print("이름: ");
				String name = scn.next();
				System.out.print("계좌번호: ");
				int account = scn.nextInt();

				bankSystem.deposit(account);
				
			} else if (input == 5) {
				System.out.println("=======================");
				System.out.println("입금 메뉴입니다.");
				System.out.println("아래에 이름과 계좌번호를 입력하세요.");
				System.out.print("이름: ");
				String name = scn.next();
				System.out.print("계좌번호: ");
				int account = scn.nextInt();

				bankSystem.withdraw(account);
			}
		}
	}
}
