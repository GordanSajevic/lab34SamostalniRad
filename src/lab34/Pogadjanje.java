package lab34;
import java.util.Scanner;


public class Pogadjanje {

	//Samostalni rad
	
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		System.out.println("Igra pogađanje broja! Pokušajte pogoditi zamišljeni broj između 1 i 100: ");
		int number = 1 + (int)(Math.random()*(100-1));
		int num = unos.nextInt();
		while(num != number)
		{
			if (num > number)
			{
				System.out.println("Zamišljeni broj je manji! Pokušajte opet: ");
				num = unos.nextInt();
			}
			else if (num < number)
			{
				System.out.println("Zamišljeni broj je veći! Pokušajte opet: ");
				num = unos.nextInt();
			}
		}
		if (num == number)
		{
			System.out.println("Čestitam, pogodili ste!");
		}
		
	}

}
