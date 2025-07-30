package lab1;
import java.util.Scanner;
public class char_is_alphabet {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char c=sc.next().charAt(0);
		sc.close();
		boolean a=Character.isAlphabetic(c);
		if(a==true) {
			System.out.println("It is an alphabet");
		}else {
			System.out.println("It is not an alphabet");
		}
	}
}