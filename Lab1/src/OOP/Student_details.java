package OOP;
import java.util.Scanner;
public class Student_details {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Student Name: ");
		String name=sc.nextLine();
		System.out.print("Enter Student Roll.No: ");
		String roll=sc.nextLine();
		System.out.print("Enter Student Branch: ");
		String Branch=sc.nextLine();
		sc.close();
		System.out.println("Student's Detail's are: ");
		System.out.println("Name: "+name);
		System.out.println("Roll.No: "+roll);
		System.out.println("Branch: "+Branch);
	}
}