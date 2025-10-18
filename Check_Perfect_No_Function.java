// Write a function to check if a number is a perfect number. use function

import java.util.*;
public class Check_Perfect_No_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		perfectNo(no);
		//int result = perfectNo(no);
		//System.out.println("Display the ")
	}

	public static void perfectNo(int no)
	{
		int sum = 0;
		int i = 1;
		while(no != i)
		{
	
			if(no % i == 0)
			{
				sum = sum + i;
			}
			i++;
		}
		String str = (no == sum) ? "Number is Perfect no: " + no : "Number is Not Perfect no " + no;
		System.out.println(str);
	}
}