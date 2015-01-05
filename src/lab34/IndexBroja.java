package lab34;

import java.util.Scanner;

public class IndexBroja {

	//Samostalni rad
	//Program za uneseni broj vraća njegov index u nizu, ili javlja da broj nije član niza
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int array[] = new int[10];
		for (int i=0; i<10; i++)
		{
			array[i] = 1+(int)(Math.random()*(20-1));
		}
		System.out.println("Unesite broj: ");
		int number = unos.nextInt();
		boolean isInArray = false;
		for (int i=0; i<10; i++)
		{
			if (array[i] == number)
			{
				System.out.println("Index unesenog broja je: " + i);
				isInArray = true;
			}
		}
		if (isInArray == false)
		{
			System.out.println("Broj nije u nizu.");
		}
	}
	
}
