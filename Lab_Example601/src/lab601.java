import java.util.Scanner;

public class lab601 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int [] positiveNumber = new int[7];
		for (int i = 0; i < positiveNumber.length; i ++) {
			System.out.print("Input number "+(i+1)+" : ");
			if (positiveNumber[i]%2 !=0) {
				countOfOdd++;
			}
		}
		System.out.print();
		System.out.println("There are " + countOfOdd + " of off number");
		for (int_posNum : positiveNumber) {
			if (_posNum %2 !=0) {
					System.out.print(_posNum+"");
				}
		}
	}
}

