import java.util.Scanner;

import javax.swing.JOptionPane;

public class lab606 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] nums = { 25,78,41,22,36,85,37};
		int index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array:"));
		while (index<0 || index > (nums.length-1)) {
		 index = Integer.parseInt(JOptionPane.showInputDialog("Input index of array, again: ");
		}

}
