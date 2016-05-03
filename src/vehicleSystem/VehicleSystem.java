package vehicleSystem;

import java.util.Scanner;

public class VehicleSystem {
	//�ȶ���100���Ŀͳ����ų��Ŀռ䣬�Ժ����ֱ����չ
	private Coach[] coach=new Coach[100];
	private car[] Car=new car[100];
	
	//�����ڳ����������ʼ��carNum=3,coachNum=2
	private int carNum;
	private int coachNum;
	
	//ϵͳ����Ա����Ϣ�����֡�Ա����
	private String manageName;
	private int manageID;
	
	//init��ʼ���ų��Ϳͳ�
	{
		
		
		Car[0]=new car();
		Car[0].setKinds("�ų�");
		Car[0].setModels("���������");
		Car[0].setColor("��ɫ");
		Car[0].setCarNum("³B5574");
		Car[0].setDayRates(450);
		
		Car[1]=new car();
		Car[1].setKinds("�ų�");
		Car[1].setModels("����550i");
		Car[1].setColor("��ɫ");
		Car[1].setCarNum("³B5X74");
		Car[1].setDayRates(500);
		
		Car[2]=new car();
		Car[2].setKinds("�ų�");
		Car[2].setModels("���������");
		Car[2].setColor("��ɫ");
		Car[2].setCarNum("³B2254");
		Car[2].setDayRates(700);
		
		coach[0]=new Coach();
		coach[0].setKinds("С�ͳ�");
		coach[0].setSeating(15);
		coach[0].setColor("��ɫ");
		coach[0].setCarNum("³A15560");
		coach[0].setDayRates(1200);
		
		coach[1]=new Coach();
		coach[1].setKinds("��ͳ�");
		coach[1].setSeating(30);
		coach[1].setColor("��ɫ");
		coach[1].setCarNum("³A5580");
		coach[1].setDayRates(2000);
		
		carNum=3;
		coachNum=2;
	}
	//��ʼ������Ա����Ϣ
	
	public VehicleSystem(String manageName, int manageID) {
		super();
		this.manageName = manageName;
		this.manageID = manageID;
	}
	
	public VehicleSystem() {
		// TODO Auto-generated constructor stub
	}

	//�Ñ�ʹ�õĲˆ�
	public void showMenu(){
		System.out.println("***************************");
		System.out.println("\t"+"��ӭ�������޹�˾");
		System.out.println("****************************");
		System.out.println("�˵�ѡ��");
		System.out.println("1.��ѯ�γ�\n2.��ѯ�ͳ�\n3.�����ų�\n4.���޿ͳ�\n0.�˳�");
		System.out.println("���������ѡ��");
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
	
	
	//ϵ�y����T��ʹ�òˆ�
	public void showMenus(){
		System.out.println("***************************");
		System.out.println("\t"+"���M�빫˾ϵ�y");
		System.out.println("****************************");
		System.out.println("�˵�ѡ��");
		System.out.println("1.�����ų�\n2.���ӿͳ�\n3.ɾ���ų�\n4.ɾ���ͳ�\n0.�˳�");
		System.out.println("���������ѡ��");

		
	}
	public void QueryCar(){
		for (int i = 0; i < carNum; i++) {
			System.out.println("����:"+Car[i].getKinds());
			System.out.println("����:"+Car[i].getModels());
			System.out.println("���ƺ�:"+Car[i].getCarNum());
			System.out.println("����ɫ:"+Car[i].getColor());
			System.out.println("�����:"+Car[i].getDayRates());
			System.out.println();
			
			
		}
	}
	
	public void QueryCoach(){
		for (int i = 0; i < coachNum; i++) {
			System.out.println("����:"+coach[i].getKinds());
			System.out.println("������:"+coach[i].getSeating());
			System.out.println("���ƺ�:"+coach[i].getCarNum());
			System.out.println("����ɫ:"+coach[i].getColor());
			System.out.println("�����:"+coach[i].getDayRates());
			System.out.println();
			
		}
		
	}
	public void rentCoach(int i,int days){
		System.out.println("������ĳ�����Ϣ��:");
		System.out.println("����:"+coach[i-1].getKinds());
		System.out.println("������:"+coach[i-1].getSeating());
		System.out.println("���ƺ�:"+coach[i-1].getCarNum());
		System.out.println("����ɫ:"+coach[i-1].getColor());
		System.out.println("�����:"+coach[i-1].getDayRates());
		int cost=coach[i-1].calculatePrice(days);
		System.out.println("���⳵Ϊ��:"+days+"\t�����:"+cost);
		System.out.println("���ס���ƺţ�����Կ�ף�������죡");
		System.out.println();
	}
	
	
	public void rentCar(int n,int days){
		
		System.out.println("������ĳ�����Ϣ��:");
		System.out.println("����:"+Car[n-1].getKinds());
		System.out.println("����:"+Car[n-1].getModels());
		System.out.println("���ƺ�:"+Car[n-1].getCarNum());
		System.out.println("����ɫ:"+Car[n-1].getColor());
		System.out.println("�����:"+Car[n-1].getDayRates());
		int cost=Car[n-1].calculatePrice(days);
		System.out.println("���⳵Ϊ��:"+days+"\t�����:"+cost);
		System.out.println("���ס���ƺţ�����Կ�ף�������죡");
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
