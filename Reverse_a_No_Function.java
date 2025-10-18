/*Reverse a Number
Write a function reverseNumber(int n) that returns the reverse of a given number.
Example: Input 456 → Output: 654.*/

import java.util.Scanner;
public class Reverse_a_No_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		reverseNumber(no);
	}

	public static void reverseNumber(int n)
	{
		int rev = 0, rem = 0;
		while(n != 0)
		{
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		} 
		System.out.println("Reverse a Number: " + rev);
	}
}