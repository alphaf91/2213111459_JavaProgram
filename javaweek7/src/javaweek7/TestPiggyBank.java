import java.util.*;
package javaweek7;


public class TestPiggyBank {
	static Scanner scan = new Scanner(System.in);
	static PiggyBank pb = new PiggyBank();

	public static void main(String[] args) {
		inputSizeofPiggybank();
		

	}
	public static void inputSizeofPiggybank() {
		System.out.println("Money Total: "+pb.getTotal());
		System.out.println("Please define size of PiggyBank:");
		pb.setPiggybank(scan.nextInt());
		System.out.println("Size of your Piggy bank:"+pb.getPiggyBank());
		
		
	}
	public static void inputCoin() {
		while (true) {
		System.out.println("\n===================");
		System.out.println("Menu of PiggyBank");
		System.out.println("=====================");
		System.out.println("[1] one baht.");
		System.out.println("[2] one baht.");
		System.out.println("[3] one baht.");
		System.out.println("[4] one baht.");
		System.out.println("[5] Exit");
		System.out.println("=====================");
		System.out.println("Please select choice[1-5]:");
		int choice = scan.nextInt();
		if (choice==1) {
			System.out.println("Insert 1 baht money:");
			pb.addOne(scan.nextInt());
			System.out.println("Money Total:"+pb.getTotal());
		}else if (choice==2) {
			System.out.println("Insert 2 baht money:");
			pb.addtwo(scan.nextInt());
			System.out.println("Money Total:"+pb.getTotal());
		}else if (choice==3) {
			System.out.println("Insert 5 baht money:");
			pb.addfive(scan.nextInt());
			System.out.println("Money Total:"+pb.getTotal());
		}else if (choice==4) {
			System.out.println("Insert 10 baht money:");
			pb.addten(scan.nextInt());
			System.out.println("Money Total:"+pb.getTotal());
		}else if (choice==5) {
			System.out.println("Bye Bye");
			break;
		}



	}

}
