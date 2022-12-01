import java.util.*;
public class lab402 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input some sentence : ");
		String sentence = scan.nextLine();
		while(!sentence.endsWith(".")) {
			System.out.print("The sentence must end wish full stop point :");
			sentence = scan.nextLine();
		}
		System.out.println();
		int space = sentence.indexOf(' ');
		for (int i=0;i<sentence.length();i++) {
			if (sentence.charAt(i) !=' ') {
				System.out.print(sentence.charAt(i));
			}
			else {
				System.out.println("");
			}
		}
	}

}
