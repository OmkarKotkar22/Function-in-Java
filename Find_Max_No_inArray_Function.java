//WAP to create function name as int findMax(int a[]) this function accepts an array as a parameter and finds the max value from array and returns it.


import java.util.*;
public class Find_Max_No_inArray_Function
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter the Size of Array: ");
		int size = sc.nextInt();

		int a[] = new int[size];
		System.out.println("Enter the value in the Array: ");
		for(int i = 0; i < a.length; i++)
		{
			a[i] = sc.nextInt();
		}

		int max[] = findMax(a);
		System.out.println("Display the Max Value: " + max[0]);

		int min[] = findMax(a);
		System.out.println("Display the Min Value: " + min[1]);

	}
	public static int[] findMax(int arr[])
	{
		int bigArr[] = new int[2];

		int max = Integer.MIN_VALUE;

		int min = Integer.MAX_VALUE;

		for(int i = 0; i < arr.length; i++)
		{
			if(max < arr[i])
			{
				max = arr[i];
			}

			if(min > arr[i])
			{
				min = arr[i];
			}
		}

		/*int min = Integer.MAX_VALUE;
		for(int i = 0; i < arr.length; i++)
		{
			if(min > arr[i])
			{
				min = arr[i];
			}
		}*/

		bigArr[0] = max;
		bigArr[1] = min;
		
		return bigArr;
	}
}