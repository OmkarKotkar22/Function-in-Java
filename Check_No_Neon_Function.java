//Write a function to check whether the given number is a neon number (sum of digits of square = number). use function
import java.util.*;
public class Check_No_Neon_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		neonNo(no);
	}
	public static void neonNo(int no)
	{
		int sq = no * no;
		int sum = 0;
		int temp = no;
		while(sq != 0)
		{
			int rem = sq % 10;
			sum = sum + rem;
			sq = sq / 10;
		}
		no = temp;
		if(sum == no)
		{
			System.out.println("Number is Neon: "+ no);
		}
		else
		{
			System.out.println(" Number is not Neon: "+ no);
		}
	}
}