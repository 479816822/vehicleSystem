package vehicleSystem;

public class car extends Vehicle{
	private String models;		//桥车的品牌

	//初始化属性，品牌不能被改变
	public car(String kinds, String carNum, String color, int dayFee, String action, String models) {
		super(kinds, carNum, color, dayFee, action);
		this.models = models;
	}
	
	//输出自己的属性，自己的信息
	public void showNew(Vehicle Car){
		System.out.println("类型:"+Car.getKinds());
		System.out.println("车型:"+getModels());
		System.out.println("车牌号:"+Car.getCarNum());
		System.out.println("车颜色:"+Car.getColor());
		System.out.println("日租金:"+Car.getdayFee());
		System.out.println("车的状态"+Car.getAction());
		System.out.println();
	}
	public String getModels() {
		return models;
	}
		

}
