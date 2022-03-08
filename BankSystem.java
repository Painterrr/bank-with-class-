import java.util.Scanner;

public class BankSystem {
	Scanner scn = new Scanner(System.in);  // ���ο��� scanner�� ���°� �ƴ϶�, �Ű������� �޴� ���� ���?
	int num = 100; // �迭 �� ����
	int top = 0; // ��� ���� �迭�� ����
	Information[] info = new Information[num];

	public void createAccount(String name, int account) { // �ߺ��˻�, ������ �Է�. �̿뵥����= top, info, name, account
		for (int i = 0; i < top; i++) { // �ߺ��˻�. "<= top"�� �ƴ� ������ top�� ��ϵ� ���°� �ƴ϶� ������ ����.
			if (info[i].name.equals(name)) { // ã�� �̸��� ���� ���� info[i].name.equals(name)���� �ۼ��ϸ� ��
				return;
			}
		}
		info[top] = new Information(); // ���� Ŭ������ �������� Ŭ������ �����ؾ� ��.
		info[top].name = name;
		info[top].account = account;
		info[top].balance = 0;
		System.out.println("���°� ��ϵǾ����ϴ�.");
		System.out.println(info[top].name + info[top].account + info[top].balance);
		top++;
	}

	public void retriveAccount(String name, int account) { // �ߺ��˻�, ������ �Է�. �̿뵥����= top, info, name, account
		for (int i = 0; i < top; i++) {
			if (info[i].name.equals(name) && info[i].account == account) {
				call(i);
			} else {
				System.out.println("��ϵ� ���������� �ƴմϴ�.");
			}
		}
	}

	public void retrieveBalance(String name, int account) {
		for (int i = 0; i < top; i++) {
			if (info[i].name.equals(name) && info[i].account == account) {
				call(i);
			} else {
				System.out.println("��ϵ� ���������� �ƴմϴ�.");
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
				System.out.println("��ϵ� ���������� �ƴմϴ�.");
			}
		}
	}
	
	public void withdraw(String name, int account) {
		for (int i = 0; i < top; i++) {
			if (info[i].name.equals(name) && info[i].account == account) {
				call(i);
//				System.out.println(info[i].name + "/" + info[i].account + "/" + info[i].balance); // �� �ڵ尡 ������, �ܺο� �޼��带 �����ΰ� ���⼭�� �޼��带 ȣ���ϸ� ���?

				int money = scn.nextInt();
				
				if((info[i].balance - money) <= 0) {
					System.out.println("����ܾ��� �����մϴ�. �ܾ��� Ȯ���ϼ���.");
					break;
				} else {
					info[i].balance -= money;
					System.out.println(info[i].balance);
				}
				
				/*
				info[i].balance -= money;
				if(info[i].balance <= 0) {
					System.out.println("����ܾ��� �����մϴ�. ���� �ְ� ����ϼ��� �Ծ�."); // ����ó�! �̹� ���̳ʽ��� ���� �����鼭 �����ְ� �ִٰ� ��¸� �ϸ� �ٳ�! ���۾�!!!! ���� ������!!
				} else {
					System.out.println(info[i].balance);
				}
				*/
				
			} else {
				System.out.println("��ϵ� ���������� �ƴմϴ�.");
			}
		}
	}
	
	public void call(int position) {
		System.out.println(info[position].name + "/" + info[position].account + "/" + info[position].balance);
	}
}