package String;
import java.util.*;
public class Anagram {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String b=sc.nextLine();
		sc.close();
		char ac[]=a.toCharArray();
		char bc[]=b.toCharArray();
		Arrays.sort(ac);
		Arrays.sort(bc);
		String t=new String(ac);
		String y=new String(bc);
		if(t.equals(y)) {
			System.out.print("anagram");
		}else {
			System.out.print("Not a anagram");
		}
	}
}