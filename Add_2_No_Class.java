import java.util.*;

class Add
{
	Scanner sc = new Scanner(System.in);
	int a, b, c;

	void acceptInput()
	{
		System.out.println("Enter the first No: ");
		a = sc.nextInt();

		System.out.println("Enter the Second No: ");
		b = sc.nextInt();
	}

	void calAdd()
	{
		c = a + b;
		System.out.println("Addition of Two Number: " + c);
	}
}

public class Add_2_No_Class
{
	public static void main(String x[])
	{
		Add a = new Add();

		a.acceptInput();
		a.calAdd();
	}
}