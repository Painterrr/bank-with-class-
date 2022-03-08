import java.util.Scanner;

public class BankSystem {
	Scanner scn = new Scanner(System.in);  // 내부에서 scanner를 쓰는게 아니라, 매개변수로 받는 것이 어떨까?
	int num = 100; // 배열 총 길이
	int top = 0; // 사용 중인 배열의 길이
	Information[] info = new Information[num];

	public void createAccount(String name, int account) { // 중복검사, 데이터 입력. 이용데이터= top, info, name, account
		for (int i = 0; i < top; i++) { // 중복검사. "<= top"이 아닌 이유는 top은 등록된 계좌가 아니라 비교하지 않음.
			if (info[i].name.equals(name)) { // 찾는 이름이 같을 경우는 info[i].name.equals(name)으로 작성하면 됨
				return;
			}
		}
		info[top] = new Information(); // 값을 클래스에 넣으려면 클래스를 생성해야 함.
		info[top].name = name;
		info[top].account = account;
		info[top].balance = 0;
		System.out.println("계좌가 등록되었습니다.");
		System.out.println(info[top].name + info[top].account + info[top].balance);
		top++;
	}

	public void retriveAccount(String name, int account) { // 중복검사, 데이터 입력. 이용데이터= top, info, name, account
		for (int i = 0; i < top; i++) {
			if (info[i].name.equals(name) && info[i].account == account) {
				call(i);
			} else {
				System.out.println("등록된 계좌정보가 아닙니다.");
			}
		}
	}

	public void retrieveBalance(String name, int account) {
		for (int i = 0; i < top; i++) {
			if (info[i].name.equals(name) && info[i].account == account) {
				call(i);
			} else {
				System.out.println("등록된 계좌정보가 아닙니다.");
			}
		}
	}

	public void deposit(String name, int account) {
		for (int i = 0; i < top; i++) {
			if (info[i].name.equals(name) && info[i].account == account) {
				call(i);

				Scanner scn = new Scanner(System.in);
				int money = scn.nextInt();
				info[i].balance += money;
				System.out.println(info[i].balance);
			} else {
				System.out.println("등록된 계좌정보가 아닙니다.");
			}
		}
	}
	
	public void withdraw(String name, int account) {
		for (int i = 0; i < top; i++) {
			if (info[i].name.equals(name) && info[i].account == account) {
				call(i);
//				System.out.println(info[i].name + "/" + info[i].account + "/" + info[i].balance); // 이 코드가 많은데, 외부에 메서드를 만들어두고 여기서는 메서드를 호출하면 어떨까?

				int money = scn.nextInt();
				
				if((info[i].balance - money) <= 0) {
					System.out.println("출금잔액이 부족합니다. 잔액을 확인하세요.");
					break;
				} else {
					info[i].balance -= money;
					System.out.println(info[i].balance);
				}
				
				/*
				info[i].balance -= money;
				if(info[i].balance <= 0) {
					System.out.println("출금잔액이 부족합니다. 돈을 넣고 출금하세요 님아."); // 웃기시네! 이미 마이너스로 내돈 뺐으면서 출금장애가 있다고 출력만 하면 다냐! 사기꾼아!!!! 내돈 돌려줘!!
				} else {
					System.out.println(info[i].balance);
				}
				*/
				
			} else {
				System.out.println("등록된 계좌정보가 아닙니다.");
			}
		}
	}
	
	public void call(int position) {
		System.out.println(info[position].name + "/" + info[position].account + "/" + info[position].balance);
	}
}