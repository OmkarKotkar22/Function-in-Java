//Write a function to check whether a number is prime or not. use function 

import java.util.*;
public class Check_No_is_Prime_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		checkPrime(no);
	}

	public static void checkPrime(int no)
	{
		Boolean flag = true;
		if(no <= 1)
		{
			flag = false;
		}
		for(int i = 2; i < no; i++)
		{
			if(no % i == 0)
			{
				flag = false;
				break;
			}
		}
		if(flag)
		{
			System.out.println("Display the Prime Number: "+ no);
		}
		else
		{
			System.out.println("Not Prime Number");
		}
	}
}