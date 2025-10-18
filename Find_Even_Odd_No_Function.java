/*Check Even or Odd
Write a function isEven(int n) that returns true if the number is even, otherwise false.
Test the function with user input.
*/

import java.util.*;
public class Find_Even_Odd_No_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int a = sc.nextInt();

		if(isEven(a))
		{
			System.out.println(a + " is Even No");
		}
		else
		{
			System.out.println(a+ " is Odd No");
		}
	}

	public static boolean isEven(int a)
	{
		if(a % 2 == 0)
		{
			return true; //System.out.println("Number is Even");
		}
		else
		{
			return false; //System.out.println("Number is Odd");
		}
	}
}