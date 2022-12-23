package javaweek7;
import java.util.*;
import java.text.DecimalFormat;

public class StockProduct {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Product[] stcproduct = new Product[4];
	    DecimalFormat df = new DecimalFormat("#,###.00");
	    for(int i =0;i<stcproduct.length;i++) {
	    	//stcproduct[i] = new Product;
	    	System.out.print("Input product ID    : ");
	    	stcproduct[i].setid(scan.next());
	    	System.out.print("Input product Unit  : ");
	    	stcproduct[i].setunit(scan.nextInt());
	    	while(stcproduct[i].getUnit() <=0) {
	    		System.out.print("Input product Unit, again ");
	    		stcproduct[i].setunit(scan.nextInt());
	    	}
	    	System.out.print("Input product Price : ");
	    	stcproduct[i].setPrice(scan.nextDouble());
	    	while(stcproduct[i].getPrice() <=0) {
	    		System.out.print("Input product Price, again ");
	    		stcproduct[i].setPrice(scan.nextInt());
	    	}
	    	System.out.println();
	    	System.out.print("------------------------------------------------------------");
	    	double totalCount= 0;
	    	for(int e = 0;e<stcproduct.length;e++) {
	    		System.out.print("Product ID: "+stcproduct[e].getid()+","+"Total price ="+df.format(stcproduct[e].calculate())+"baht.");
	    	}
	    	System.out.print("------------------------------------------------------------");
	    	totalCount +=stcproduct[i] .calculate();
	    	System.out.print("Total price of all product is "+df.format(totalCount)+"baht.");
	    }

	}

}
