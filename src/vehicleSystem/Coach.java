package vehicleSystem;

public class Coach extends Vehicle{
	private int Seating;//客车的座位数
	
	//初始化属性，座位数不能被改变的
	public Coach(String kinds, String carNum, String color, int dayFee, String action, int seating) {
		super(kinds, carNum, color, dayFee, action);
		Seating = seating;
	}
	
	//输出自己的属性，自己的信息
	public void showNew(Vehicle coach){
		System.out.println("类型:"+coach.getKinds());
		System.out.println("车型:"+getSeating());
		System.out.println("车牌号:"+coach.getCarNum());
		System.out.println("车颜色:"+coach.getColor());
		System.out.println("日租金:"+coach.getdayFee());
		System.out.println("车的状态"+coach.getAction());
		System.out.println();
	}

	public int getSeating() {
		return Seating;
	}
		

}
