package vehicleSystem;

import java.util.Scanner;

public class Manager {
	//创建一个管理员
	VehicleSystem manager=new VehicleSystem("张华",1100);
	
	Scanner input=new Scanner(System.in);
	
	//管理员的功能
	public void manage(){
		//验证管理员的信息
		System.out.print("输入管理员的姓名:");
		String name=input.next();
		System.out.print("输入管理员的ID:");
		int ID=input.nextInt();
		boolean True=manager.check(name,ID);
	while(True){
		manager.showMenus();
		
		System.out.println("请输入你的选择:");
		int choice=input.nextInt();
		if(choice==0)
			break;
		switch (choice) {
		//增加一辆桥车
		case 1:
			car Car=new car();
			System.out.println("请输入新客车的信息:");
			System.out.print("类型:");
			Car.setKinds(input.next());
			System.out.print("车型:");
			Car.setModels(input.next());
			System.out.print("颜色:");
			Car.setColor(input.next());
			System.out.print("车牌号:");
			Car.setCarNum(input.next());
			System.out.print("日租金:");
			Car.setDayRates(input.nextInt());
			manager.setCar(Car);

			
			break;
		//增加一辆客车
		case 2:
			
			Coach coach=new Coach();
			System.out.println("请输入新客车的信息:");
			System.out.print("类型:");
			coach.setKinds(input.next());
			System.out.print("客座数:");
			coach.setSeating(input.nextInt());
			System.out.print("颜色:");
			coach.setColor(input.next());
			System.out.print("车牌号:");
			coach.setCarNum(input.next());
			System.out.print("日租金:");
			coach.setDayRates(input.nextInt());
			manager.setCoach(coach);
			
			break;
		//删除一辆桥车
		case 3:
			
			break;
		//删除一辆客车
		case 4:
			
			break;

		default:
			break;
		}
		
		
	}
	}

}
