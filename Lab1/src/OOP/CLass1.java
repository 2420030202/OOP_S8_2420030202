package OOP;
import java.util.Scanner;
class CLass1
{
public static void main(String args[])
{
Scanner sc = new Scanner(System.in);
System.out.print("Enter operation:");
String op=sc.next();
System.out.println("Enter number1: ");
int a=sc.nextInt();
System.out.println("Enter number2: ");
int b=sc.nextInt();
sc.close();
int c;
switch(op) {
case "+":
	c=a+b;
	System.out.println("Your answer: "+c);break;
case "-":
	c=a-b;
	System.out.println("Your answer: "+c);break;
case "/":
	c=a/b;
	System.out.println("Your answer: "+c);break;
case "%":
	c=a%b;
	System.out.println("Your answer: "+c);break;
case "*":
	c=a*b;
	System.out.println("Your answer: "+c);break;
}
}
}