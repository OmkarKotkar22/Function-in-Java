//Write a function to check if a number is an Armstrong number. use function

import java.util.*;
public class Check_is_No_Armstrong_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		//checkArmstrongNo(no);
		int result = checkArmstrongNo(no);
		System.out.println("Display the Armstrong No: " + result);
	}
	
	public static int checkArmstrongNo(int no)
	{
		int sum = 0;
		int count = 0;
		int temp = no;
		while(no != 0)
		{
			no = no % 10;
			count++;
			no = no / 10;
		}

		int p = (int)Math.Pow(10, count);
		no = temp;
		while(no != 0)
		{
			int rem = no % 10;
			sum = sum * p;
			no = no / 10;
		}

		return sum;
	}
}