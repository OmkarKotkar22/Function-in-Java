//Write a function to check if a number is a strong number (sum of factorial of digits = number). use function
import java.util.*;
public class Check_Strong_No_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		int result = strongNo(no);
		if(result == no)
		{
			System.out.println("Given No is Strong No" + no);
		}

		else
		{
			System.out.println("Given No is not Strong No" + no);
		}
	}

	public static int strongNo(int no)
	{
		int sum = 0;
		int f = 1;
		while(no != 0)
		{
			int rem = no % 10;
			while(rem != 0)
			{
				f = f * rem;
				rem--;
			}
			sum = sum + f;
			f = 1;
			no = no / 10;
		}
		return sum;
	}
}