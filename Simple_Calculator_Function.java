/*Simple Calculator using Functions
Write separate functions:
add(int a, int b)
subtract(int a, int b)
multiply(int a, int b)
divide(int a, int b)
Call them based on user choice.
*/

import java.util.Scanner;
public class Simple_Calculator_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		int a = sc.nextInt();

		System.out.println("Enter the Second Number: ");
		int b = sc.nextInt();

		add(a, b);
		sub(a, b);
		multi(a, b);
		div(a, b);
	}

	public static void add(int a, int b)
	{
		System.out.println("Addition: " + (a + b));
	}

	public static void sub(int a, int b)
	{
		System.out.println("Subtraction: " + (a - b));
	}
	
	public static void multi(int a, int b)
	{
		System.out.println("Multiplication: " + (a * b));
	}
	
	public static void div(int a, int b)
	{
		System.out.println("Division: " + (a / b));
	}
}