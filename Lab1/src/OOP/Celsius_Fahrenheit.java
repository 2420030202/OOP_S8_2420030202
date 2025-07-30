package OOP;
import java.util.Scanner;
public class Celsius_Fahrenheit {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Celsius: ");
		double c=sc.nextFloat();
		sc.close();
		System.out.println("Fahrenheit is: "+((9/5)*c+32));
	}
}
