package lab1;
import java.util.Scanner;
public class Sum_of_digits_of_a_number {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		sc.close();
		while(a>0) {
			sum+=a%10;
			a/=10;
		}
		System.out.println("The sum is:"+sum);
	}
}
