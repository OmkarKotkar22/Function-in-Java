//Write a function to check if a given number is a palindrome number. use function

import java.util.*;
public class Check_No_Palindrome_function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		palindromeNo(no);
		//int result = palindromeNo(no);
		//System.out.println("Number is Palindrome: " + result);
	}

	public static void palindromeNo(int no)
	{
		int temp = no;
		int rev = 0;
		while(no != 0)
		{
			int rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}

		String str = (temp == rev) ? "Number is Palindrome" : "Number is Not Palindrome";
		System.out.println(str);
	}
}