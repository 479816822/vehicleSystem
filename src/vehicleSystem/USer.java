package vehicleSystem;

import java.util.Scanner;

public class USer {

	//����һ���⳵ϵͳ�Ķ���rent
	VehicleSystem rent=new VehicleSystem();

	public void use(){
	Scanner input=new Scanner(System.in);
	
	//����Աʹ��
	
	while(true){
	//��ʾ�˵�
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
		System.out.println("��ѡ������Ҫ��ĳ���������(1,2,3):(1.�������2����550i��3.���������");
		n=input.nextInt();
		System.out.println("���������⳵������:");
		int days=input.nextInt();
		rent.rentCar(n, days);
		break;
	case 4:
		int m=-1;
		System.out.println("��ѡ������Ҫ��Ŀͳ�������(1,2):(1.<=16����>16��)");
		m=input.nextInt();
		System.out.println("���������⳵������:");
		days=input.nextInt();
		rent.rentCar(m, days);
		
		break;
		
	default:
		break;
	}
	
	}
	}

}
