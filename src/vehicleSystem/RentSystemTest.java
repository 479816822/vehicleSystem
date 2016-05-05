package vehicleSystem;

import java.util.Scanner;

public class RentSystemTest {

	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		//用户对象
		USer user =new USer();
		//管理者对象
		Manager manager =new Manager("张华",123);
		
		user.use();
	//manager.manage();


	}

	
	
	
}
