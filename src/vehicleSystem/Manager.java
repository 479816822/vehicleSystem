package vehicleSystem;

import java.util.Scanner;

public class Manager {
	// 管理员的属性
	private String manageName;
	private int manageID;

	// 创建一个管理员
	public Manager(String manageName, int manageID) {
		super();
		this.manageName = manageName;
		this.manageID = manageID;
	}

	Scanner input = new Scanner(System.in);

	// 管理员的功能
	public void manage(VehicleSystem manager) {
		// 验证管理员的信息
		System.out.print("输入管理员的姓名:");
		String name = input.next();
		System.out.print("输入管理员的ID:");
		int ID = input.nextInt();
		boolean True = manager.check(name, ID);
		while (True) {
			manager.showMenus();
			int choice = input.nextInt();
			if (choice == 0)
				break;
			switch (choice) {
			// 增加一辆桥车
			case 1:
				System.out.println("请输入新桥车的信息:");
				System.out.print("类型:");
				String kinds = input.next();
				System.out.print("车型:");
				String models = input.next();
				System.out.print("颜色:");
				String color = input.next();
				System.out.print("车牌号:");
				String carNum = input.next();
				System.out.print("日租金:");
				int dayFee = input.nextInt();
				System.out.println("状态:");
				String action = input.next();
				car Car = new car(kinds, carNum, color, dayFee, action, models);
				manager.setCar(Car);
				manager.setCarNum(1);
				break;
			// 增加一辆客车
			case 2:
				System.out.println("请输入新客车的信息:");
				System.out.print("类型:");
				kinds = input.next();
				System.out.print("客座数:");
				int seating = input.nextInt();
				System.out.print("颜色:");
				color = input.next();
				System.out.print("车牌号:");
				carNum = input.next();
				System.out.print("日租金:");
				dayFee = input.nextInt();
				System.out.println("状态:");
				action = input.next();
				Coach coach = new Coach(kinds, carNum, color, dayFee, action, seating);
				manager.setCoach(coach);
				break;
			// 删除一辆桥车
			case 3:
				break;
			// 删除一辆客车
			case 4:
				break;
			default:
				break;
			}
			System.out.println("继续吗？(Y/N)");
			System.out.println("输入你的选择:");
			String sel=input.next();
			if(sel.equals("N"))
				break;
			

		}
	}

}
