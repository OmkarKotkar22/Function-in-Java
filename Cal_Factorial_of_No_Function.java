//Write a function to calculate the factorial of a number (using loop only).use function


import java.util.*;
public class Cal_Factorial_of_No_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		calFact(no);	
	}

	public static void calFact(int no)
	{
		int sum = 1;
		while(no != 0)
		{
			sum = sum * no;
			no--;
		}
		System.out.println("Factorial of No: " + sum);
	}
}