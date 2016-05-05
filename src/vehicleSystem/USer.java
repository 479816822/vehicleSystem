package vehicleSystem;

import java.util.Scanner;

public class USer {

	// 创建一个租车系统的对象rent
	VehicleSystem rent = new VehicleSystem();

	public void use() {
		Scanner input = new Scanner(System.in);
		boolean T = false;
		while (true) {
			// 显示菜单
			rent.showMenu();
			int choice = 0;
			choice = input.nextInt();
			if (choice == 0) {
				System.out.println("谢谢使用，退出!");
				break;
			}
			switch (choice) {
			case 1:
				System.out.println("1.查询桥车\n2.查询客车\n3.继续\n0.退出");
				System.out.print("你的选择:");
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
				System.out.println("你需要租多少辆车请输入数目:");
				int num = input.nextInt();
				for (int i = 0; i < num; i++) {
					System.out.println("1.租桥车\n2.租客车");
					System.out.print("你的选择:");
					key = input.nextInt();
					switch (key) {
					case 1:
						int n = -1;
						System.out.println("请选择你需要租的车车型输入(1,2,3):(1.别克商务，2宝马550i，3.别克林荫大道");
						n = input.nextInt();
						System.out.println("请输入你租车的天数:");
						int days = input.nextInt();
						cost += rent.rentCar(n, days);
						break;
					case 2:
						int m = -1;
						System.out.println("请选择你需要租的客车型输入(1,2):(1.<=16座，>16座)");
						m = input.nextInt();
						System.out.println("请输入你租车的天数:");
						days = input.nextInt();
						cost += rent.rentCar(m, days);
						break;
					default:
						break;
					}
				}
				System.out.println("你一共租了" + num + "俩车" + "共花费" + cost);
				System.out.println("祝你一路平安！");
				System.out.print("继续吗:(Y/N)");
				String n = input.next();
				if (n.equals("N"))
					T = true;
				break;
			case 3:
				// 还车
				System.out.println("请输入你还的车的车牌号:");
				n = input.next();
				boolean True = rent.backVehicle(n);
				if (True) {
					System.out.println("还车成功！");
				} else
					System.out.println("还车失败！");
				break;
			default:
				break;
			}
			if (T == true) {
				System.out.println("谢谢使用，退出!");
				break;
			}

		}
	}

}
