package vehicleSystem;

import java.util.Scanner;

public class VehicleSystem {
	// �ȶ���100���Ŀͳ����ų��Ŀռ䣬�Ժ����ֱ����չ
	private Coach[] coach = new Coach[100];
	private car[] Car = new car[100];

	// �����ڳ����������ʼ��carNum=3,coachNum=2
	private int carNum;
	private int coachNum;

	// ϵͳ����Ա����Ϣ�����֡�Ա����
	private String manageName;
	private int manageID;

	static Scanner input = new Scanner(System.in);
	// init��ʼ���ų��Ϳͳ��������ʱ��Ĺ�˾ֻ�������ų��������ͳ�
	{
		Car[0] = new car("�ų�", "³B5574", "��ɫ", 500, "�ڿ�", "���������");
		Car[1] = new car("�ų�", "³B5004", "��ɫ", 600, "�ڿ�", "����");
		Car[2] = new car("�ų�", "³B5554", "��ɫ", 700, "�ڿ�", "����");
		coach[0] = new Coach("С�ͳ�", "³A15560", "��ɫ", 1500, "�ڿ�", 15);
		coach[1] = new Coach("��ͳ�", "³A15566", "��ɫ", 3500, "�ڿ�", 30);
		carNum = 3;
		coachNum = 2;
	}

	// ��ʼ������Ա����Ϣ
	public VehicleSystem(String manageName, int manageID) {
		super();
		this.manageName = manageName;
		this.manageID = manageID;
	}

	public VehicleSystem() {

	}

	// �Ñ�ʹ�õĲˆΣ������û����й���ѡ��
	public void showMenu() {
		System.out.println("***************************");
		System.out.println("\t" + "��ӭ�������޹�˾");
		System.out.println("****************************");
		System.out.println("�˵�ѡ��");
		System.out.println("1.��ѯ\n2.����\n3.����\n0.�˳�");
		System.out.println("���������ѡ��");
	}

	public boolean check(String name, int ID) {
		boolean True = false;
		if (ID == manageID && name.equals(manageName)) {
			True = true;
			return True;
		}

		return True;
	}

	// ϵ�y����T��ʹ�òˆ�
	public void showMenus() {
		System.out.println("***************************");
		System.out.println("\t" + "���M�빫˾ϵ�y");
		System.out.println("****************************");
		System.out.println("�˵�ѡ��");
		System.out.println("1.�����ų�\n2.���ӿͳ�\n3.ɾ���ų�\n4.ɾ���ͳ�\n0.�˳�");
		System.out.println("���������ѡ��");

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
		System.out.println("������ĳ�����Ϣ��:");
		coach[i - 1].showNew(coach[i - 1]);
		int cost = coach[i - 1].calculatePrice(days);
		coach[i - 1].setAction("����");
		System.out.println("���⳵Ϊ��:" + days +"��"+ "\t�����:" + cost);
		System.out.println("���ס���ƺ�!"+coach[i].getCarNum());
		System.out.println();
		return cost;
	}

	public int rentCar(int n, int days) {

		System.out.println("������ĳ�����Ϣ��:");
		Car[n - 1].showNew(Car[n - 1]);
		int cost = Car[n - 1].calculatePrice(days);
		Car[n - 1].setAction("����");
		System.out.println("���⳵Ϊ��:" + days +"��"+ "\t�����:" + cost);
		System.out.println("���ס���ƺ�!"+Car[n-1].getCarNum());
		System.out.println();
		return cost;

	}

	public boolean backVehicle(String carID) {
		boolean T = false;
		for (int i = 0; i < carNum; i++) {
			if (carID.equals(Car[i].getCarNum())) {
				T = true;
				Car[i].setAction("�ڿ�");
				return T;
			}

		}
		for (int i = 0; i < coachNum; i++) {
			if (carID.equals(coach[i].getCarNum())) {
				T = true;
				coach[i].setAction("�ڿ�");
				return T;
			}

		}
		return T;
	}

	public Coach[] getCoach(String name) {
		if (name.equals(manageName)) {
			return coach;
		} else {
			System.out.println("����Ȩ�ޣ�");
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
			System.out.println("����Ȩ�ޣ�");
		}
		return null;
	}

	public void setCar(car Car) {
		this.Car[carNum] = Car;
		carNum++;
		System.out.println(carNum);
	}

}
