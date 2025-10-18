// Write a function to find the sum of cubes of first n natural numbers. use function

import java.util.*;
public class Sum_of_Cube_of_N_Natural_No_Func
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		sum_Cb_NaturalNo(no);
	}

	public static void sum_Cb_NaturalNo(int no)
	{
		int sum = 0;
		for(int i = 1; i <= no; i++)
		{
			sum = sum + i * i * i;
		}
		System.out.println("Sum of Cubes of first N Natural Number: " + sum);
	}
}