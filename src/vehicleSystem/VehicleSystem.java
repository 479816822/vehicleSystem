package vehicleSystem;

import java.util.Scanner;

public class VehicleSystem {
	//先定义100个的客车和桥车的空间，以后可以直接扩展
	private Coach[] coach=new Coach[100];
	private car[] Car=new car[100];
	
	//是现在车俩的数量最开始是carNum=3,coachNum=2
	private int carNum;
	private int coachNum;
	
	//系统管理员的信息，名字、员工号
	private String manageName;
	private int manageID;
	
	//init初始化桥车和客车
	{
		
		
		Car[0]=new car();
		Car[0].setKinds("桥车");
		Car[0].setModels("别克商务座");
		Car[0].setColor("黑色");
		Car[0].setCarNum("鲁B5574");
		Car[0].setDayRates(450);
		
		Car[1]=new car();
		Car[1].setKinds("桥车");
		Car[1].setModels("宝马550i");
		Car[1].setColor("黑色");
		Car[1].setCarNum("鲁B5X74");
		Car[1].setDayRates(500);
		
		Car[2]=new car();
		Car[2].setKinds("桥车");
		Car[2].setModels("别克林荫大道");
		Car[2].setColor("白色");
		Car[2].setCarNum("鲁B2254");
		Car[2].setDayRates(700);
		
		coach[0]=new Coach();
		coach[0].setKinds("小客车");
		coach[0].setSeating(15);
		coach[0].setColor("白色");
		coach[0].setCarNum("鲁A15560");
		coach[0].setDayRates(1200);
		
		coach[1]=new Coach();
		coach[1].setKinds("大客车");
		coach[1].setSeating(30);
		coach[1].setColor("白色");
		coach[1].setCarNum("鲁A5580");
		coach[1].setDayRates(2000);
		
		carNum=3;
		coachNum=2;
	}
	//初始化管理员的信息
	
	public VehicleSystem(String manageName, int manageID) {
		super();
		this.manageName = manageName;
		this.manageID = manageID;
	}
	
	public VehicleSystem() {
		// TODO Auto-generated constructor stub
	}

	//用戶使用的菜單
	public void showMenu(){
		System.out.println("***************************");
		System.out.println("\t"+"欢迎汽车租赁公司");
		System.out.println("****************************");
		System.out.println("菜单选择：");
		System.out.println("1.查询轿车\n2.查询客车\n3.租赁桥车\n4.租赁客车\n0.退出");
		System.out.println("请输入你的选择：");
	}


	Scanner input=new Scanner(System.in);
	
	public boolean check(String name,int ID){
		boolean True=false;
		if(ID==manageID&&name.equals(manageName)){
			True=true;
			return True;
		}
			
		return True;
	}
	
	
	//系統管理員的使用菜單
	public void showMenus(){
		System.out.println("***************************");
		System.out.println("\t"+"正進入公司系統");
		System.out.println("****************************");
		System.out.println("菜单选择：");
		System.out.println("1.增加桥车\n2.增加客车\n3.删除桥车\n4.删除客车\n0.退出");
		System.out.println("请输入你的选择：");

		
	}
	public void QueryCar(){
		for (int i = 0; i < carNum; i++) {
			System.out.println("类型:"+Car[i].getKinds());
			System.out.println("车型:"+Car[i].getModels());
			System.out.println("车牌号:"+Car[i].getCarNum());
			System.out.println("车颜色:"+Car[i].getColor());
			System.out.println("日租金:"+Car[i].getDayRates());
			System.out.println();
			
			
		}
	}
	
	public void QueryCoach(){
		for (int i = 0; i < coachNum; i++) {
			System.out.println("类型:"+coach[i].getKinds());
			System.out.println("客座数:"+coach[i].getSeating());
			System.out.println("车牌号:"+coach[i].getCarNum());
			System.out.println("车颜色:"+coach[i].getColor());
			System.out.println("日租金:"+coach[i].getDayRates());
			System.out.println();
			
		}
		
	}
	public void rentCoach(int i,int days){
		System.out.println("你所租的车的信息是:");
		System.out.println("类型:"+coach[i-1].getKinds());
		System.out.println("客座数:"+coach[i-1].getSeating());
		System.out.println("车牌号:"+coach[i-1].getCarNum());
		System.out.println("车颜色:"+coach[i-1].getColor());
		System.out.println("日租金:"+coach[i-1].getDayRates());
		int cost=coach[i-1].calculatePrice(days);
		System.out.println("你租车为期:"+days+"\t租金共是:"+cost);
		System.out.println("请记住车牌号，这是钥匙，旅行愉快！");
		System.out.println();
	}
	
	
	public void rentCar(int n,int days){
		
		System.out.println("你所租的车的信息是:");
		System.out.println("类型:"+Car[n-1].getKinds());
		System.out.println("车型:"+Car[n-1].getModels());
		System.out.println("车牌号:"+Car[n-1].getCarNum());
		System.out.println("车颜色:"+Car[n-1].getColor());
		System.out.println("日租金:"+Car[n-1].getDayRates());
		int cost=Car[n-1].calculatePrice(days);
		System.out.println("你租车为期:"+days+"\t租金共是:"+cost);
		System.out.println("请记住车牌号，这是钥匙，旅行愉快！");
		System.out.println();
		
	}

	public Coach[] getCoach() {
		return coach;
	}

	public void setCoach(Coach coach) {
		this.coach[coachNum]=coach;
	
		coachNum++;
	}
	

	public car[] getCar() {
		return Car;
	}

	public void setCar(car Car) {
		
		this.Car[carNum]=Car;
		carNum++;
	}
	


	
	
}
