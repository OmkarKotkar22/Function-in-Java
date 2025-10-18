/*Sum of Digits
Write a function sumOfDigits(int n) that calculates and returns the sum of digits of a given number.
Example: Input 123 → Output: 6.*/


import java.util.Scanner;
public class Sum_of_Digit_of_No_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		sumOfDigits(no);
	}

	public static void sumOfDigits(int n)
	{
		int sum = 0;
		while(n != 0)
		{
			int rem = n % 10;
			sum = sum + rem;
			n = n / 10;
		}
		System.out.println("Sum of Digits in Number: " + sum);
	}
}