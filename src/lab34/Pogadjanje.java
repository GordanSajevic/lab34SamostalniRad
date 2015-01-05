package lab34;
import java.util.Scanner;


public class Pogadjanje {

	//Samostalni rad
	//Igra pogađanje broja. Program "zamisli" broj između 1 i 100, a korisnik pogađa broj, dok ga program navodi
	//tako što javlja da li je uneseni broj veći ili manji od zamišljenog
	
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
