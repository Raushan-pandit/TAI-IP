
import java.util.*;
public class Calculator {


 public static void main(String[] args) 
	{
		int a,b;
		char ch;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a no : ");
		a=sc.nextInt();
		System.out.print("Enter a no : ");
		b=sc.nextInt();
		System.out.print("Enter an operator : ");
		ch=sc.next().charAt(0);
		switch(ch)
		{
			case '+':
			{
				System.out.println("a+b="+(a+b));
				break;
			}
			case '-':
			{
				System.out.println("a-b="+(a-b));
				break;
			}
			case'*':
			{
				System.out.println("a*b="+(a*b));
				break;
			}
			case'/':
			{
				System.out.println("a/b="+(a/b));
				break;
			}
			default:
			{
				System.out.println("Enter valid operator");
			}
		}		
	}
}