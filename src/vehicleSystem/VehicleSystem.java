package vehicleSystem;

import java.util.Scanner;

public class VehicleSystem {
	// 先定义100个的客车和桥车的空间，以后可以直接扩展
	private Coach[] coach = new Coach[100];
	private car[] Car = new car[100];

	// 是现在车俩的数量最开始是carNum=3,coachNum=2
	private int carNum;
	private int coachNum;

	// 系统管理员的信息，名字、员工号
	private String manageName;
	private int manageID;

	static Scanner input = new Scanner(System.in);
	// init初始化桥车和客车，最初的时候的公司只有三俩桥车，两辆客车
	{
		Car[0] = new car("桥车", "鲁B5574", "黑色", 500, "在库", "别克商务座");
		Car[1] = new car("桥车", "鲁B5004", "黑色", 600, "在库", "宝马");
		Car[2] = new car("桥车", "鲁B5554", "黑色", 700, "在库", "奔驰");
		coach[0] = new Coach("小客车", "鲁A15560", "白色", 1500, "在库", 15);
		coach[1] = new Coach("大客车", "鲁A15566", "白色", 3500, "在库", 30);
		carNum = 3;
		coachNum = 2;
	}

	// 初始化管理员的信息
	public VehicleSystem(String manageName, int manageID) {
		super();
		this.manageName = manageName;
		this.manageID = manageID;
	}

	public VehicleSystem() {

	}

	// 用戶使用的菜單，引导用户进行功能选择
	public void showMenu() {
		System.out.println("***************************");
		System.out.println("\t" + "欢迎汽车租赁公司");
		System.out.println("****************************");
		System.out.println("菜单选择：");
		System.out.println("1.查询\n2.租赁\n3.还车\n0.退出");
		System.out.println("请输入你的选择：");
	}

	public boolean check(String name, int ID) {
		boolean True = false;
		if (ID == manageID && name.equals(manageName)) {
			True = true;
			return True;
		}

		return True;
	}

	// 系統管理員的使用菜單
	public void showMenus() {
		System.out.println("***************************");
		System.out.println("\t" + "正進入公司系統");
		System.out.println("****************************");
		System.out.println("菜单选择：");
		System.out.println("1.增加桥车\n2.增加客车\n3.删除桥车\n4.删除客车\n0.退出");
		System.out.println("请输入你的选择：");

	}

	public int getCarNum() {
		return carNum;
	}

	public void setCarNum(int carNum) {
		this.carNum += carNum;
	}

	public void QueryCar() {
		System.out.println(this.carNum);
		for (int i = 0; i < carNum; i++) {
			Car[i].showNew(Car[i]);

		}
	}

	public void QueryCoach() {
		for (int i = 0; i < coachNum; i++) {
			coach[i].showNew(coach[i]);
		}

	}

	public int  rentCoach(int i, int days) {
		System.out.println("你所租的车的信息是:");
		coach[i - 1].showNew(coach[i - 1]);
		int cost = coach[i - 1].calculatePrice(days);
		coach[i - 1].setAction("出租");
		System.out.println("你租车为期:" + days +"天"+ "\t租金共是:" + cost);
		System.out.println("请记住车牌号!"+coach[i].getCarNum());
		System.out.println();
		return cost;
	}

	public int rentCar(int n, int days) {

		System.out.println("你所租的车的信息是:");
		Car[n - 1].showNew(Car[n - 1]);
		int cost = Car[n - 1].calculatePrice(days);
		Car[n - 1].setAction("出租");
		System.out.println("你租车为期:" + days +"天"+ "\t租金共是:" + cost);
		System.out.println("请记住车牌号!"+Car[n-1].getCarNum());
		System.out.println();
		return cost;

	}

	public boolean backVehicle(String carID) {
		boolean T = false;
		for (int i = 0; i < carNum; i++) {
			if (carID.equals(Car[i].getCarNum())) {
				T = true;
				Car[i].setAction("在库");
				return T;
			}

		}
		for (int i = 0; i < coachNum; i++) {
			if (carID.equals(coach[i].getCarNum())) {
				T = true;
				coach[i].setAction("在库");
				return T;
			}

		}
		return T;
	}

	public Coach[] getCoach(String name) {
		if (name.equals(manageName)) {
			return coach;
		} else {
			System.out.println("你无权限！");
		}
		return null;
	}

	public void setCoach(Coach coach) {
		this.coach[coachNum] = coach;                      
		coachNum++;
		System.out.println(coachNum);
	}

	public car[] getCar(String name) {
		if (name.equals(manageName)) {
			return Car;
		} else {
			System.out.println("你无权限！");
		}
		return null;
	}

	public void setCar(car Car) {
		this.Car[carNum] = Car;
		carNum++;
		System.out.println(carNum);
	}

}
