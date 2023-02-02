package javaweek7;
import java.util.*;

public class CheckstockProduct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("How many product list in stock : ");
		Product[] stcProduct = new Product[scan.nextInt()];
		System.out.println();
		for (int i = 0; i < stcProduct.length; i++) {
			stcProduct[i] = new Product();
			System.out.print("Input product Id    : ");
			stcProduct[i].setid(scan.next());
			System.out.print("Input product Unit  : ");
			stcProduct[i].setunit(scan.nextInt());
			System.out.println();
		} // end for
		System.out.println("---------------------------------");
		System.out.println("List of product in 'LOW' status . ");
		System.out.println("---------------------------------");
		for (Product _stcProduct : stcProduct) {
			if (_stcProduct.CheckStockProduct().equalsIgnoreCase("LOW")) {
				System.out.println(">> " + _stcProduct.getid() + " has " + _stcProduct.getUnit() + " units");
			}
		}
		System.out.println("---------------------------------");
		System.out.println("List of product in 'NORMAL' status . ");
		System.out.println("---------------------------------");
		for (Product _stcProduct : stcProduct) {
			if (_stcProduct.CheckStockProduct().equalsIgnoreCase("NORMAL")) {
				System.out.println(">> " + _stcProduct.getid() + " has " + _stcProduct.getUnit() + " units");
			}
		}
		System.out.println("---------------------------------");
		System.out.println("List of product in 'HIGH' status . ");
		System.out.println("---------------------------------");
		for (Product _stcProduct : stcProduct) {
			if (_stcProduct.CheckStockProduct().equalsIgnoreCase("HIGH")) {
				System.out.println(">> " + _stcProduct.getid() + " has " + _stcProduct.getUnit() + " units");
			}
		}
	}
}