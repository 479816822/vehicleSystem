package vehicleSystem;

import java.util.Scanner;

public class USer {

	// ����һ���⳵ϵͳ�Ķ���rent
	VehicleSystem rent = new VehicleSystem();

	public void use() {
		Scanner input = new Scanner(System.in);
		boolean T = false;
		while (true) {
			// ��ʾ�˵�
			rent.showMenu();
			int choice = 0;
			choice = input.nextInt();
			if (choice == 0) {
				System.out.println("ллʹ�ã��˳�!");
				break;
			}
			switch (choice) {
			case 1:
				System.out.println("1.��ѯ�ų�\n2.��ѯ�ͳ�\n3.����\n0.�˳�");
				System.out.print("���ѡ��:");
				int key = input.nextInt();
				if (key == 3) {
					break;
				} else if (key == 0) {
					T = true;
					break;
				}
				switch (key) {
				case 1:
					rent.QueryCar();
					break;
				case 2:
					rent.QueryCar();
					break;
				default:
					break;
				}
				break;
			case 2:
				int cost = 0;
				System.out.println("����Ҫ�����������������Ŀ:");
				int num = input.nextInt();
				for (int i = 0; i < num; i++) {
					System.out.println("1.���ų�\n2.��ͳ�");
					System.out.print("���ѡ��:");
					key = input.nextInt();
					switch (key) {
					case 1:
						int n = -1;
						System.out.println("��ѡ������Ҫ��ĳ���������(1,2,3):(1.�������2����550i��3.���������");
						n = input.nextInt();
						System.out.println("���������⳵������:");
						int days = input.nextInt();
						cost += rent.rentCar(n, days);
						break;
					case 2:
						int m = -1;
						System.out.println("��ѡ������Ҫ��Ŀͳ�������(1,2):(1.<=16����>16��)");
						m = input.nextInt();
						System.out.println("���������⳵������:");
						days = input.nextInt();
						cost += rent.rentCar(m, days);
						break;
					default:
						break;
					}
				}
				System.out.println("��һ������" + num + "����" + "������" + cost);
				System.out.println("ף��һ·ƽ����");
				System.out.print("������:(Y/N)");
				String n = input.next();
				if (n.equals("N"))
					T = true;
				break;
			case 3:
				// ����
				System.out.println("�������㻹�ĳ��ĳ��ƺ�:");
				n = input.next();
				boolean True = rent.backVehicle(n);
				if (True) {
					System.out.println("�����ɹ���");
				} else
					System.out.println("����ʧ�ܣ�");
				break;
			default:
				break;
			}
			if (T == true) {
				System.out.println("ллʹ�ã��˳�!");
				break;
			}

		}
	}

}
