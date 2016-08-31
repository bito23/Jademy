import java.util.Scanner;

public class RemoveKey {

	public int removeKeychains(int breloace) {
		int removeKey;
		Scanner keyboard = new Scanner(System.in);
		System.out.println("You have " + breloace + " How many to remove?");
		removeKey = keyboard.nextInt();
		breloace -= removeKey;
		System.out.println("You now have " + breloace + " keychains.\n");
		return breloace;
	}

}