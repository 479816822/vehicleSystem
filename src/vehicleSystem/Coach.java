package vehicleSystem;

public class Coach extends Vehicle{
	private int Seating;//�ͳ�����λ��
	
	//��ʼ�����ԣ���λ�����ܱ��ı��
	public Coach(String kinds, String carNum, String color, int dayFee, String action, int seating) {
		super(kinds, carNum, color, dayFee, action);
		Seating = seating;
	}
	
	//����Լ������ԣ��Լ�����Ϣ
	public void showNew(Vehicle coach){
		System.out.println("����:"+coach.getKinds());
		System.out.println("����:"+getSeating());
		System.out.println("���ƺ�:"+coach.getCarNum());
		System.out.println("����ɫ:"+coach.getColor());
		System.out.println("�����:"+coach.getdayFee());
		System.out.println("����״̬"+coach.getAction());
		System.out.println();
	}

	public int getSeating() {
		return Seating;
	}
		

}
