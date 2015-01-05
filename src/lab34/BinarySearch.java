package lab34;

import java.util.Scanner;

public class BinarySearch {

	//Predavanje
	
	public static int binarySearch(int[] array, int el)
	{

		int startIndex=0;
		int endIndex = array.length-1;
		while(startIndex <= endIndex)
		{
			int m = (endIndex + startIndex)/2;
			System.out.printf("s: %d, e: %d, m: %d", startIndex, endIndex, m);
			if (array[m] == el)
			{
				return m;
			}
			else if (array[m] < el)
			{
				endIndex = m - 1;
			}
			else
			{
				startIndex = m + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int array[] = new int[10];
		for (int i=0; i<10; i++)
		{
			array[i] = 1+(int)(Math.random()*(20-1));
		}
		System.out.println("Unesite broj: ");
		int number = unos.nextInt();
		binarySearch(array, number);

	}

}
