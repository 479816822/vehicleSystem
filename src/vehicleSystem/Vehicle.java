package vehicleSystem;

public abstract class Vehicle {

	//���������е�����
	private String kinds;		//���࣬�ų��Ϳͳ�
	private String carNum;		//���ƺ�
	private String color;		//����ɫ
	private int dayFee;		//�����
	private String action;	//ÿһ������״̬������״̬���ڿ�״̬����ʱΪ���⣬�ڿ�ʱ�ڿ�
	
	//��ʼ�����Ļ������ԣ����ࡢ���ƺš�������֮�����ٸı�
	public Vehicle(String kinds, String carNum, String color, int dayFee, String action) {
		super();
		this.kinds = kinds;
		this.carNum = carNum;
		this.color = color;
		this.dayFee = dayFee;
		this.action = action;
	}
	//
	public abstract void showNew(Vehicle V);
	
	//�����⳵�ܷ���
	public int calculatePrice(int days){
		int cost=days*dayFee;
		return cost;
	}
	public int getDayFee() {
		return dayFee;
	}

	public void setDayFee(int dayFee) {
		this.dayFee = dayFee;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}


	public String getKinds() {
		return kinds;
	}

	public String getCarNum() {
		return carNum;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getdayFee() {
		return dayFee;
	}

	public void setdayFee(int dayFee) {
		this.dayFee = dayFee;
	}
	
	

}
