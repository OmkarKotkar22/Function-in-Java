//Write a function to find the sum of first n natural numbers. use function

import java.util.*;
public class N_of_Natural_No_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int no = sc.nextInt();

		naturalNo(no);
		//int result = naturalNo(no);
		//System.out.println("Natural No: " + result);
	}

	public static int naturalNo(int no)
	{
		int i = 0, total = 0;
		while(no > i)
		{
			total = i + 1; 
			System.out.println("Natural No: " + total);
			i++;
		}
		return total;
	}
}