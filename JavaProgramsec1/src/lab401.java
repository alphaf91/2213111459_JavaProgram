import java.util.*;
public class lab401 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String fullName = "";
		String firstName = "";
		String lastName = "";
		System.out.print("Full Name : ");
		fullName = scan.nextLine();
		int space=fullName.indexOf(" ");
		if (space==-1) {
			System.out.println("Incorrect Name");
		}
		else {
			firstName=((fullName.substring(0,space).toUpperCase()))	;
			lastName=((fullName.substring(space+1).toLowerCase()))	;
			System.out.print("First Name: "+ firstName+"\nlast Name: "+ lastName  );
			
		}
		
	}

}
