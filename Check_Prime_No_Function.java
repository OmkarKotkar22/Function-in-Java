/*Check Prime Number
Write a function isPrime(int n) that checks if a number is prime or not.
Use it in main() to test different inputs.
*/

import java.util.Scanner;
public class Check_Prime_No_Function
{
	public static void main(String x[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int a = sc.nextInt();

		isPrime(a);
	}

	public static void isPrime(int a)
	{
		Boolean flag = true;
		if(a <= 1)
		{
			flag = false;
		}
		for(int i = 2; i < a; i++)
		{
			if(a % i == 0)
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println(a + "is a Prime No");
		}
		else
		{
			System.out.println(a + "is not a Prime No");			
		}
	}
}