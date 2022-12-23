package javaweek7;
import java.util.*;

public class Product {
	private String id;
	private int unit;
	private double price;

	public void setid(String ID) {
		id = ID;
		

	}
	public String getid() {
		return id;
		
	}
	public void setunit(int UNIT) {
		unit = UNIT;
	}
	public int getUnit() {
		return unit;
		
	}
	public void setPrice(double PRICE) {
		price = PRICE;
	}
	public double getPrice() {
		return price;
		
	}
	public double calculate() {
		 double calculate = unit * price;
		 return calculate;
		
	}
	public String CheckStockProduct() {
		if(unit <5) {
			return "LOW";
		}else if(unit >=5 && unit <=50 ){
			return "NORMAL";
		}else {
			return "HIGH";
		}
	}

}
