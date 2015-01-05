package lab34;

public class Insertion {

	//Predavanje
	
	public static void main(String[] args) {
		int[] numbers = new int[] {345, 123, 1, 12, 234, 334, 45, 56, 78, 2, 79, 23};
		insertionSort(numbers);
		for (int n : numbers)
		{
			System.out.println(n);
		}

	}

	private static void insertionSort(int[] array) {
		for (int i=0; i < array.length; i++)
		{
			int newPos = i;
			while(newPos > 0 && array[newPos - 1] > array[newPos])
			{
				int t = array[newPos - 1];
				array[newPos - 1] = array[newPos];
				array[newPos] = t;
				newPos--;
			}
		}
		
	}

}
