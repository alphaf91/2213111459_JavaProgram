import java.util.*;
public final class lab603 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] numberOfInteger = { 78,36,58,41,25,92,75};
		
		System.out.print("Input index of array : ");
		int indexOfArray = scan.nextInt();
				
		while (indexOfArray<0 || indexOfArray > (numberOfInteger.length-1)) {
			System.out.print("Input index of array, again: ");
			indexOfArray = scan.nextInt();
		}
		System.out.println();
		System.out.print("Value in current index is"+ (numberOfInteger[indexOfArray]));
		if(indexOfArray==6) {
			System.out.print("Soory," +indexOfArray+ "is the last index in array.");
		} else {
			System.out.print("Value in current index is"+ (numberOfInteger[indexOfArray +1]));
		}

	}

}
