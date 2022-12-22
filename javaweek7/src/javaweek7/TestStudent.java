
package javaweek7;
import java.util.*;

public class TestStudent {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		student[] std = new student[3];
		for(int i=0;i<std.length;i++) {
			std[i] = new student();
			System.out.println("INPUT INFORMATION OF STUDENT" +(i+1));
			System.out.print("Input studennt name: ");
			std[i].setName(scan.next());
			System.out.print("Input studennt score: ");
			std[i].setScore(scan.nextInt());
			while(!std[i].checkScore()) {
				System.out.print("INput student score, again:");
				std[i].setScore(scan.nextInt());
			}
			System.out.println();
		}
		System.out.println();
		System.out.println("LIST OF PASS STUDENT (>=50)");
		System.out.println("-----------------------------------------------------------");
		for(student student:std) {
			if(student.isPass()) {
				System.out.println(">>" +student.getName()+"get grade" +student.findGrade());
			}
		}
	}

}
