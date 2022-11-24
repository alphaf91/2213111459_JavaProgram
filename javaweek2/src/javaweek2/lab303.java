package javaweek2;

import javax.swing.*;
import java.text.*;
import java.util.Random;


public class lab303 {

	public static void main(String[] args) {
		Random rand = new Random();
		int balance = rand.nextInt(9) * 100000;
		DecimalFormat frm = new DecimalFormat("#,###");
		int withdraw = Integer.parseInt(
		JOptionPane.showInputDialog("Your balance: "+frm.format(balance)+"\nInput money to withdraw:"));
			
		int b1000 = withdraw/1000;
		int b500 = withdraw/500;
		int withdraw1000 = withdraw-(b1000*1000);
	    b500 = withdraw1000/500;
		int withdraw500 = withdraw1000-(b500*500);
		int b100 = withdraw500/100;
		int withdraw100 =withdraw500-(b100*100);
		
			  
		if (withdraw > balance) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than balance",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else if (withdraw >20000) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw more than 20,000 ",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
			
		}
		else if (withdraw100 !=0) {
			JOptionPane.showMessageDialog(null, "Error:Cannot withdraw "+withdraw100+" baht.",
					"ERROR",
					JOptionPane.ERROR_MESSAGE);
		}
		else {
			JOptionPane.showMessageDialog(null,
					"You withdraw"+frm.format(withdraw)+"baht."+
			        "\n1000  = "+b1000+
			        "\n500   = "+b500+
			        "\n100   = "+b100);
		}

	}

}
