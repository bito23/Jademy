import java.util.Scanner;

public class Checkout {
	public void checkout(int breloace, int cost) {

		System.out.println("\nCHECKOUT\n\n");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("What is your name: ");
		String name = keyboard.nextLine();
		System.out.println("You have " + breloace + " keychains.");
		System.out.println("Keychains cost $ " + cost + " each.");
		System.out.println("Total cost is $ " + (breloace * cost) + " .");
		System.out.println("Thanks for your order, " + name + " !");
	}
}
