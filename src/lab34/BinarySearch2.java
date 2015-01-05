package lab34;

import java.util.Scanner;

public class BinarySearch2 {
	
	//samostalan rad
	//Binary search uz pomoć petlje. Funkcija vraća -1 ako broj nije u nizu
	
	public static int binarySearchLoop(int[] array, int number)
	{
		int start = 0;
		int end = array.length;
		int mid;
		while (start < end)
		{
			mid = (start+end)/2;
			if (array[mid] == number)
			{
				return mid;
			}
			else if (array[mid] > number)
			{
				end = mid;
			}
			else
			{
				start = ++mid;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int[] array = new int [10];
		System.out.println("Enter number: ");
		int num = unos.nextInt();
		for (int i=0; i<10; i++)
		{
			array[i] = i+1;
		}
		System.out.println(binarySearchLoop(array, num));
	}

}
