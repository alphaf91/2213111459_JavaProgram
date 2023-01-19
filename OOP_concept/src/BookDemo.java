import java.util.*;

public class BookDemo {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		book book = new book();
		System.out.print("Input book title   :");
		book.setTitle(scan.nextLine());
		System.out.print("Input book price   :");
		book.setPrice(scan.nextFloat());
		System.out.print("Input publish year   :");
		book.setPublishyear(scan.nextInt());
		
		System.out.println();
		System.out.println(book);

	}

}
