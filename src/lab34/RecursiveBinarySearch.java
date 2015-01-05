package lab34;

public class RecursiveBinarySearch {

	public static int binarySearch(int start, int end, int[] array, int number)
	{
		if ( start >= end)
		{
			return -1;
		}
		int mid = (start+end)/2;
		if (array[mid] == number)
		{			
			return mid;
		}
		if (array[mid] > number)
		{
			return binarySearch(start, mid, array, number);
		}
		if (array[mid] < number)
		{
			return binarySearch(mid+1, end, array, number);
		}
		return -1;
	}
	
	public static void main(String[] args) {
		int[] array = new int[10];
		for (int i=0; i<10; i++)
		{
			array[i] = i+1;
		}
		int mid = (0 + array.length)/2;
		System.out.println(binarySearch(0, array.length, array, 9));

	}

}
