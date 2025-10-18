//Write a function to find the reverse of a number.use function

import java.util.*;
public class Reverse_No_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		int result = revNo(no);
		System.out.println("Reverse Number is: " + result);	
	}

	public static int revNo(int no)
	{
		int rev = 0;
		int rem = 0;
		while(no != 0)
		{
			rem = no % 10;
			rev = rev * 10 + rem;
			no = no / 10;
		}
		return rev;
	}
}

