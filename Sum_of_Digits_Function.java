//Write a function to find the sum of digits of a given number. use function

import java.util.*;
public class Sum_of_Digits_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		int result = sumDigits(no);
		System.out.println("Display the Sum of Digits: " + result);
	}

	public static int sumDigits(int no)
	{
		int sum = 0;
		int rem = 0;
		while(no != 0)
		{
			rem = no % 10;
			sum = sum + rem;
			no = no / 10;
		}
		
		return sum;
	}
}