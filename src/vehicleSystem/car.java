package vehicleSystem;

public class car extends Vehicle{
	private String models;		//�ų���Ʒ��

	//��ʼ�����ԣ�Ʒ�Ʋ��ܱ��ı�
	public car(String kinds, String carNum, String color, int dayFee, String action, String models) {
		super(kinds, carNum, color, dayFee, action);
		this.models = models;
	}
	
	//����Լ������ԣ��Լ�����Ϣ
	public void showNew(Vehicle Car){
		System.out.println("����:"+Car.getKinds());
		System.out.println("����:"+getModels());
		System.out.println("���ƺ�:"+Car.getCarNum());
		System.out.println("����ɫ:"+Car.getColor());
		System.out.println("�����:"+Car.getdayFee());
		System.out.println("����״̬"+Car.getAction());
		System.out.println();
	}
	public String getModels() {
		return models;
	}
		

}
