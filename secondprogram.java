package cybernxt;
import java.util.Scanner;
public class secondprogram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a= sc.nextInt();
		int reverse=0; //initializing
		int k=a;
		while(a!=0)
		{
			int b = a %10;
			reverse =reverse *10+b;
			a=a/10;
		}
		System.out.println(reverse);
		
		if(k  ==reverse)
		{
			System.out.println("the number is a palindrome");
			
		}
		else
		{
			System.out.println("The number is not a palindrome");
		}

	}

}
