import java.util.*;

package javaweek7;

public class PiggyBank {

	public static void main(String[] args) {
		public int one;
		public int two;
		public int five;
		public int ten;
		public int size;
		
		

	}
	public void setPiggybank() {
		clear();
		size = s;
	}
	public void clear() {
		one = two = five = ten = 0;
	}
	public int getPiggyBank() {
		return size;
	}
	public int getTotal() {
		return one + (two*2) + (five*5) + (ten*10);
	}
    public int addOne(int c) {
		if (getTotal()+ (c*1) <= size) {
			one += c;
		} else {
			System.err.println("Piggy Bank Full");
		}
	}
    public int addtwo(int c) {
		if (getTotal()+ (c*2) <= size) {
			two += c;
		} else {
			System.err.println("Piggy Bank Full");
		}
	}
    public int addfive(int c) {
		if (getTotal()+ (c*5) <= size) {
			five += c;
		} else {
			System.err.println("Piggy Bank Full");
		}
	}
    public int addten(int c) {
		if (getTotal()+ (c*10) <= size) {
			ten += c;
		} else {
			System.out.println("Piggy Bank Full");
		}
	}



}
