package vehicleSystem;

import java.util.Scanner;

public class RentSystemTest {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		// 把管理员的信息传递给系统，以便以后检验管理员
		VehicleSystem manag = new VehicleSystem("张华",123);

		//用户对象
		USer user =new USer();
		//管理者对象
		Manager manager =new Manager("张华",123);
		
	manager.manage(manag);
	user.use(manag);


	}

	
	
	
}
