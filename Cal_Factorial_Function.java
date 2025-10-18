/*Calculate Factorial
Write a function factorial(int n) that returns the factorial of a given number.
Call it from main() and display the factorial.
*/

import java.util.Scanner;
public class Cal_Factorial_Function
{

		public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a = sc.nextInt();

		factorial(a);	
	}


	public static void factorial(int  a)
	{
		int f = 1;
		while(a != 0)
		{
			f = f * a;
			a--;
		}
		System.out.println("Factorial of Given Number is:  "+ f);
	}
}