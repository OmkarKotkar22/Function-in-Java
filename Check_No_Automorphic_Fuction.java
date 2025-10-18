//Write a function to check if a number is an automorphic number (last digits = square of number). use function

import java.util.*;
public class Check_No_Automorphic_Fuction
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		automorphicNo(no);
	}

	public static void automorphicNo(int no)
	{
		int sq = no * no;
		int temp = no;

		int count = 0;
		while(no != 0)
		{
			count++;
			no = no / 10;
		}

		int ld = sq % (int)Math.pow(10, count);

		if(ld == temp)
		{
			System.out.println("number is an automorphic number: " + temp);
		}
		else
		{
			System.out.println("number is not an automorphic number: " + temp);
		}
	}
}