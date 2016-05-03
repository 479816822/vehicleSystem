package vehicleSystem;

import java.util.Scanner;

public class USer {

	//创建一个租车系统的对象rent
	VehicleSystem rent=new VehicleSystem();

	public void use(){
	Scanner input=new Scanner(System.in);
	
	//管理员使用
	
	while(true){
	//显示菜单
	rent.showMenu();
	int choice=0;
	choice=input.nextInt();
	if(choice==0)
		break;
	switch (choice) {
	case 1:
		rent.QueryCar();
		break;
	case 2:
		rent.QueryCoach();
		break;
	case 3:
		int n=-1;
		System.out.println("请选择你需要租的车车型输入(1,2,3):(1.别克商务，2宝马550i，3.别克林荫大道");
		n=input.nextInt();
		System.out.println("请输入你租车的天数:");
		int days=input.nextInt();
		rent.rentCar(n, days);
		break;
	case 4:
		int m=-1;
		System.out.println("请选择你需要租的客车型输入(1,2):(1.<=16座，>16座)");
		m=input.nextInt();
		System.out.println("请输入你租车的天数:");
		days=input.nextInt();
		rent.rentCar(m, days);
		
		break;
		
	default:
		break;
	}
	
	}
	}

}
