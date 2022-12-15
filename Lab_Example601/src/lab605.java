import java.util.Scanner;

import javax.swing.JOptionPane;

public class lab605 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] num = new int[5];
		for (int i = 0; i < num.length; i ++) {
			 num[i] = Integer.parseInt(JOptionPane.showInputDialog("Input number "+(i+1)+" : "));
		}
		showEven(num);
		showOdd(num);

	}
	public static void showEven(int []number) {
		String space = " ";
		for(int even:number) {
			if(even%2==0)
				space = space +even+" ";
		}
		JOptionPane.showMessageDialog(null, " List of even number: "+"\n"+space);
	}
	public static void showOdd(int []number) {
		String space = " ";
		for(int odd:number) {
			if(odd%2!=0)
				space = space +odd+" ";
		}
		JOptionPane.showMessageDialog(null, " List of odd number: "+"\n"+space);
	}

}
