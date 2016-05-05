package vehicleSystem;

import java.util.Scanner;

public class Manager {
	// ����Ա������
	private String manageName;
	private int manageID;

	// ����һ������Ա
	public Manager(String manageName, int manageID) {
		super();
		this.manageName = manageName;
		this.manageID = manageID;
	}

	Scanner input = new Scanner(System.in);

	// ����Ա�Ĺ���
	public void manage(VehicleSystem manager) {
		// ��֤����Ա����Ϣ
		System.out.print("�������Ա������:");
		String name = input.next();
		System.out.print("�������Ա��ID:");
		int ID = input.nextInt();
		boolean True = manager.check(name, ID);
		while (True) {
			manager.showMenus();
			int choice = input.nextInt();
			if (choice == 0)
				break;
			switch (choice) {
			// ����һ���ų�
			case 1:
				System.out.println("���������ų�����Ϣ:");
				System.out.print("����:");
				String kinds = input.next();
				System.out.print("����:");
				String models = input.next();
				System.out.print("��ɫ:");
				String color = input.next();
				System.out.print("���ƺ�:");
				String carNum = input.next();
				System.out.print("�����:");
				int dayFee = input.nextInt();
				System.out.println("״̬:");
				String action = input.next();
				car Car = new car(kinds, carNum, color, dayFee, action, models);
				manager.setCar(Car);
				manager.setCarNum(1);
				break;
			// ����һ���ͳ�
			case 2:
				System.out.println("�������¿ͳ�����Ϣ:");
				System.out.print("����:");
				kinds = input.next();
				System.out.print("������:");
				int seating = input.nextInt();
				System.out.print("��ɫ:");
				color = input.next();
				System.out.print("���ƺ�:");
				carNum = input.next();
				System.out.print("�����:");
				dayFee = input.nextInt();
				System.out.println("״̬:");
				action = input.next();
				Coach coach = new Coach(kinds, carNum, color, dayFee, action, seating);
				manager.setCoach(coach);
				break;
			// ɾ��һ���ų�
			case 3:
				break;
			// ɾ��һ���ͳ�
			case 4:
				break;
			default:
				break;
			}
			System.out.println("������(Y/N)");
			System.out.println("�������ѡ��:");
			String sel=input.next();
			if(sel.equals("N"))
				break;
			

		}
	}

}
