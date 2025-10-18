//Write a function to generate the Fibonacci series up to n terms. use function

import java.util.*;
public class Fibonacci_series_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number 1: ");
		int no1 = sc.nextInt();

		System.out.println("Enter the Number 2: ");
		int no2 = sc.nextInt();

		System.out.println("enter the limit: ");
		int limit = sc.nextInt();

		Fibonacci(no1, no2, limit);
	}

	public static void Fibonacci(int f1, int f2, int limit)
	{
		System.out.print(f1 + " " + f2 + " ");
		int i = 1;
		int fib;
		while(i <= limit)
		{
			fib = f1 + f2;
			f1 = f2;
			f2 = fib;
			i++;
			System.out.print(fib + " ");
		}

	}
}