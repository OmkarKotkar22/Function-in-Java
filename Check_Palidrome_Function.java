/*Palindrome Check (Number or String)
Write a function isPalindrome(int n) that checks whether a number is palindrome or not.
Example: Input 121 → true.*/

import java.util.*;
public class Check_Palidrome_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();
		
		isPalindrome(no);
	}

	public static void isPalindrome(int n)
	{
		int temp = n;
		int rem = 0, rev = 0;
		while(n != 0)
		{
			rem = n % 10;
			rev = rev * 10 + rem;
			n = n / 10;
		}
		n = temp;
		if(temp == rev)
		{
			System.out.println("Number is Palindrome");
		}
		else
		{
			System.out.println("Number is not Palindrome");
		}
	}
}