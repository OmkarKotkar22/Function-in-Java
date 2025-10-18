//Write a function to check whether a number is a Harshad number (divisible by sum of its digits). use function

import java.util.*;
public class Check_Harshad_No_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		harshadNo(no);
		//int result = harshadNo(no);
		/*if(result == no)
		{
			System.out.println("No is Harshad No: " + no);
		}
		else
		{
			System.out.println("No is not Harshad No: " + no);
		}*/
	}

	public static void harshadNo(int no)
	{
		int originalNo = no;
		int rem = 0;
		int sum = 0;

		while(no != 0)
		{
			rem = no % 10;
			sum = sum + rem;
			no = no / 10;
		}

		if(originalNo % sum == 0)
		{
			System.out.println("No is Harshad No: " + originalNo);
		}
		else
		{
			System.out.println("No is not Harshad No: " + originalNo);

		}
	}
}