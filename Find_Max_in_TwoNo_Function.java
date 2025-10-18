/*Find Maximum of Two Numbers
Write a function findMax(int a, int b) that returns the maximum of two numbers.
Call this function in main() and print the result.

*/

import java.util.Scanner;
public class Find_Max_in_TwoNo_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int a = sc.nextInt();

		System.out.println("Enter the Second Number: ");
		int b = sc.nextInt();

		findMax(a, b);
	}

	public static void findMax(int a, int b)
	{
		if(a > b)
		{
			System.out.println("First Number is Maximum " + a);
		}
		else
		{
			System.out.println("Second Number is Maximum " + b);
		}
	}

}