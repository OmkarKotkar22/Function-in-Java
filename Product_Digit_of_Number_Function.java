//Write a function to find the product of digits of a given number. use function

import java.util.*;
public class Product_Digit_of_Number_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();
		
		prodNo(no);
	}

	public static void prodNo(int no)
	{
		int prod = 1;
		while(no != 0)
		{
			int rem = no % 10;
			prod = prod * rem;
			no = no / 10;
		}

		System.out.println("Product of Digit of a Given Number: " + prod);
	}
}