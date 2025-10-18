//Write a function to print the factors of a number. use function

import java.util.*;
public class Print_Factor_of_No_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		int result = Factors(no);
		System.out.println("Display the all Factors of No: " + result);
	}

	public static int Factors(int no)
	{
		int i = 1; 
		int f = 0;
		while(no != i)
		{
			if(no % i == 0)
			{
				f = no / i;
			}
		i++;
		}
		return f;
	}
}