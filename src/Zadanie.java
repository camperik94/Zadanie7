import java.util.Scanner;

public class Zadanie {
	public static void main(String[] args) {
		System.out.println("Podaj liczbe naturalna wieksza od zera");
		
		Scanner in = new Scanner(System.in);
		
		int liczba = in.nextInt();
		
		Klasa klas = new Klasa(liczba);
		
		klas.metoda();
	}
}
