package vehicleSystem;

public class Vehicle {

	private String kinds;
	private String carNum;
	private String color;
	private int dayRates;
	
	public int calculatePrice(int days){
		int cost=days*dayRates;
		return cost;
	}

	public String getKinds() {
		return kinds;
	}

	public void setKinds(String kinds) {
		this.kinds = kinds;
	}

	public String getCarNum() {
		return carNum;
	}

	public void setCarNum(String carNum) {
		this.carNum = carNum;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDayRates() {
		return dayRates;
	}

	public void setDayRates(int dayRates) {
		this.dayRates = dayRates;
	}
	
	

}
