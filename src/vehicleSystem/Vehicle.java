package vehicleSystem;

public abstract class Vehicle {

	//机动车公有的属性
	private String kinds;		//种类，桥车和客车
	private String carNum;		//车牌号
	private String color;		//车颜色
	private int dayFee;		//日租费
	private String action;	//每一个车的状态，出租状态，在库状态出租时为出租，在库时在库
	
	//初始化车的基本属性，种类、车牌号、并且在之后不能再改变
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
	
	//计算租车总费用
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
