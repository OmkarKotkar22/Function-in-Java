/*
import java.util.*;
public class functiondemo
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
	
		int no = sc.nextInt();

		int cb = cube(no);
		System.out.println("Cube of Number: " + cb);
	}

	public static int cube(int no)
	{
		int cb = no * no * no;

		return cb;
	}
}
*/


import java.util.*;
public class functiondemo
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
	
		int no = sc.nextInt();

		int cb = cube(no);
		//System.out.println("Cube of Number: " + cb);
	}

	public static void cube(int no)
	{
		int cb = no * no * no;

		//return 0;
		System.out.println("Cube of Number: " + cb);
	}
}