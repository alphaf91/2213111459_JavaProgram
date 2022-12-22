import java.util.Scanner;

public class Lab_Example6033 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] number = new int[5];
		for(int i =0; i<number.length;i++){
			System.out.print("INput number "+(i+1)+" : ");
			number[i] = scan.nextInt();
		}
		int totalNumber = sumofPos(number);
		System.out.println("Summation of positive number is "+totalNumber);

	}
	public static int sumofPos(int[] num) {
		int sum=0;
		for(int _num:num) {
			sum +=_num;
		}
		return sum;
	}

}
