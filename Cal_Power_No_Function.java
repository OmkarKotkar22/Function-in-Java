//WAP to create function name as int getPow(int base,int index): this function can accept two values of type integer and calculate its power and return it.

import java.util.*;
public class Cal_Power_No_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Base: ");
		int base = sc.nextInt();

		System.out.println("Enter the Index: ");
		int index = sc.nextInt();

		int p = getPow(base, index);
		System.out.println("Display the Power of Number: "+p);
	}
	public static int getPow(int b, int ind)
	{
		int p = 1;
		for(int i = 0; i < ind; i++)
		{
			p = p * b;
			
		}
		return p;
	}
}