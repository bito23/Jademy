import java.util.Scanner;

public class Breloc {
	public static void main(String[] args) {

		int stocBreloace = 100;
		int breloaceCos = 0;
		int pretBreloc = 10;
		int userAnswer;

		System.out.println("Ye Olde Keychain Shoppe\n");
		Scanner keyboard = new Scanner(System.in);

		do {

			System.out.println("1. Add Keychains to Order\n" 
			                 + "2. Remove Keychains from Order\n"
					         + "3. View Current Order\n" 
			                 + "4. Checkout");

			System.out.println("\nPlease enter your choice: ");
			userAnswer = keyboard.nextInt();

			switch (userAnswer) {
			case 1:
				AddKey addKey = new AddKey();
				breloaceCos = addKey.addKeychains(breloaceCos);
				stocBreloace -= breloaceCos;
				break;
			case 2:
				RemoveKey removeKey = new RemoveKey();
				breloaceCos = removeKey.removeKeychains(breloaceCos);
				stocBreloace += breloaceCos;
				break;
			case 3:
				CurrentOrder currentOrder = new CurrentOrder();
				currentOrder.viewOrder(breloaceCos, pretBreloc);
				break;
			case 4:
				Checkout checkout = new Checkout();
				checkout.checkout(breloaceCos, pretBreloc);
				break;
			default:
				System.err.println("Please enter a valid command!\n");
			}
		} while (stocBreloace > 0 && userAnswer != 4);

	}

}
