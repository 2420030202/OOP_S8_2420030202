package OOP;
import java.util.Scanner;
public class sphere {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Radius of the Sphere(r):");
		int r=sc.nextInt();
		sc.close();
		System.out.println("The Volume of the Sphere: "+(4/3)*3.14*r*r);
	}
}