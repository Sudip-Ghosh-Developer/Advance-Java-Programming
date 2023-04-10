package com.embroyo.advjava.car;

public class CarList {
	
	public String carname;
	public String colour;
	public int price;
	public CarList(String carname, String colour, int price) {
		super();
		this.carname = carname;
		this.colour = colour;
		this.price = price;
	}
	public String getCarname() {
		return carname;
	}
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public String getColour() {
		return colour;
	}
	public void setColour(String colour) {
		this.colour = colour;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CarList [carname=" + carname + ", colour=" + colour + ", price=" + price + "]";
	}

}
