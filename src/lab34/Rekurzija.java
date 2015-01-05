package lab34;

import java.util.Scanner;

public class Rekurzija {

	public static void recursion(int n)
	{
		if (n < 0)
		{
			return;
		}
		System.out.println(n);
		recursion(n-1);
	}
	
	public static int recursiveAdding(int num)
	{
		if (num == 1)
		{
			return 1;
		}
		return num + recursiveAdding(num-1);
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Enter number: ");
		int number = unos.nextInt();
		recursion(number);
		System.out.println(recursiveAdding(7));
		unos.close();
	}
}
