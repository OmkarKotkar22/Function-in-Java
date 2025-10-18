//Write a function to find the sum of first n natural numbers. use function

import java.util.*;
public class Sum_of_Natural_No_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		naturalNo(no);
	}

	public static void naturalNo(int no)
	{
		int sum = 0;
		int i = 1;
		while(i <= no)
		{
			sum = sum + i;
			i++;
		}

		System.out.println("Sum of Natural Number :" + sum);
	}
}