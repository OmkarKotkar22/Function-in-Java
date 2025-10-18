//Write a function to check if a number is an Armstrong number. use function

import java.util.*;
public class Check_is_No_Armstrong_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int no = sc.nextInt();

		//checkArmstrongNo(no);
		int result = checkArmstrongNo(no);
		if(result == no)
		{
			System.out.println("Number is Armstrong No");
		}

		else
		{
			System.out.println("Number is not Armstrong No");
		}
	}
	
	public static int checkArmstrongNo(int no)
	{
		int sum = 0;
		int count = 0;
		int temp = no;
		while(no != 0)
		{
			count++;
			no = no / 10;
		}

		no = temp;
		while(no != 0)
		{
			int rem = no % 10;
			int p = 1, j = 1;
			while(j <= count)
			{
				p = p * rem;
				j++;
			}
			no = no / 10;
			sum = sum + p;
		}

		return sum;
	}
}