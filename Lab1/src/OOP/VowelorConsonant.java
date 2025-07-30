package lab1;
import java.util.*;
public class VowelorConsonant {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		char c=sc.next().charAt(0);
		sc.close();
		boolean as=Character.isAlphabetic(c);
		if(as) {
		switch(c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U':
			System.out.println("It's a vowel");break;
		default :
			System.out.println("It's a Consonent");break;
		}
		}else {
			System.out.println("It's a Number");
		}
	}
}