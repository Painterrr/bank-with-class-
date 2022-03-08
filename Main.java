import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		BankSystem bankSystem = new BankSystem();
		Scanner scn = new Scanner(System.in);

		while (true) {
			System.out.println("=======================");
			System.out.println("�ѱ����࿡ ���� �� ȯ���մϴ�.");
			System.out.println("������ �޴� ��ȣ�� �Է��ϼ���.");
			System.out.println("1= ���� ����");
			System.out.println("2= ���� Ȯ��");
			System.out.println("3= �ܾ�Ȯ��");
			System.out.println("4= �Ա�");
			System.out.println("5= ���");
			System.out.println("0= ���α׷� ����");
			System.out.print("��ȣ�� �Է��ϼ���= ");
			int input = scn.nextInt();

			if (input == 0) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
			if (input == 1) {
				System.out.println("=======================");
				System.out.println("���»����޴��Դϴ�.");
				System.out.println("�Ʒ��� �̸��� ���¹�ȣ�� �Է��ϼ���.");
				System.out.print("�̸�: ");
				String name = scn.next();
				System.out.print("���¹�ȣ: ");
				int account = scn.nextInt();

				bankSystem.createAccount(name, account);
				
			} else if (input == 2) {
				System.out.println("=======================");
				System.out.println("����Ȯ�� �޴��Դϴ�.");
				System.out.println("���¹�ȣ�� �Է��ϼ���.");
				System.out.print("���¹�ȣ: ");
				int account = scn.nextInt();

				bankSystem.retriveAccount(account);
				
			} else if (input == 3) {
				System.out.println("=======================");
				System.out.println("�ܾ���ȸ �޴��Դϴ�.");
				System.out.println("�Ʒ��� �̸��� ���¹�ȣ�� �Է��ϼ���.");
				System.out.print("�̸�: ");
				String name = scn.next();
				System.out.print("���¹�ȣ: ");
				int account = scn.nextInt();

				bankSystem.retrieveBalance(account);
				
			} else if (input == 4) {
				System.out.println("=======================");
				System.out.println("�Ա� �޴��Դϴ�.");
				System.out.println("�Ʒ��� �̸��� ���¹�ȣ�� �Է��ϼ���.");
				System.out.print("�̸�: ");
				String name = scn.next();
				System.out.print("���¹�ȣ: ");
				int account = scn.nextInt();

				bankSystem.deposit(account);
				
			} else if (input == 5) {
				System.out.println("=======================");
				System.out.println("�Ա� �޴��Դϴ�.");
				System.out.println("�Ʒ��� �̸��� ���¹�ȣ�� �Է��ϼ���.");
				System.out.print("�̸�: ");
				String name = scn.next();
				System.out.print("���¹�ȣ: ");
				int account = scn.nextInt();

				bankSystem.withdraw(account);
			}
		}
	}
}
