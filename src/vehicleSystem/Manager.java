package vehicleSystem;

import java.util.Scanner;

public class Manager {
	//����һ������Ա
	VehicleSystem manager=new VehicleSystem("�Ż�",1100);
	
	Scanner input=new Scanner(System.in);
	
	//����Ա�Ĺ���
	public void manage(){
		//��֤����Ա����Ϣ
		System.out.print("�������Ա������:");
		String name=input.next();
		System.out.print("�������Ա��ID:");
		int ID=input.nextInt();
		boolean True=manager.check(name,ID);
	while(True){
		manager.showMenus();
		
		System.out.println("���������ѡ��:");
		int choice=input.nextInt();
		if(choice==0)
			break;
		switch (choice) {
		//����һ���ų�
		case 1:
			car Car=new car();
			System.out.println("�������¿ͳ�����Ϣ:");
			System.out.print("����:");
			Car.setKinds(input.next());
			System.out.print("����:");
			Car.setModels(input.next());
			System.out.print("��ɫ:");
			Car.setColor(input.next());
			System.out.print("���ƺ�:");
			Car.setCarNum(input.next());
			System.out.print("�����:");
			Car.setDayRates(input.nextInt());
			manager.setCar(Car);

			
			break;
		//����һ���ͳ�
		case 2:
			
			Coach coach=new Coach();
			System.out.println("�������¿ͳ�����Ϣ:");
			System.out.print("����:");
			coach.setKinds(input.next());
			System.out.print("������:");
			coach.setSeating(input.nextInt());
			System.out.print("��ɫ:");
			coach.setColor(input.next());
			System.out.print("���ƺ�:");
			coach.setCarNum(input.next());
			System.out.print("�����:");
			coach.setDayRates(input.nextInt());
			manager.setCoach(coach);
			
			break;
		//ɾ��һ���ų�
		case 3:
			
			break;
		//ɾ��һ���ͳ�
		case 4:
			
			break;

		default:
			break;
		}
		
		
	}
	}

}
