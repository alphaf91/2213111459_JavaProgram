import java.util.*;
public class lab403 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Message : ");
		String message = scan.nextLine();
		String lmessage = message.toLowerCase();
		if (lmessage.indexOf("nichi")>=0) {
			System.out.println("Nichi is a sentence");
		}
		else {
			System.out.println(message);
		}
      
	}

}
