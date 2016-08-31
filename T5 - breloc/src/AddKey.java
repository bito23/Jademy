import java.util.Scanner;

public class AddKey {
	
	

	public int addKeychains(int breloace){
		int breloaceAdaugate; 
		Scanner keyboard = new Scanner(System.in);
		System.out.println("\nYou have " + breloace + " keychains. How many to add?");
		breloaceAdaugate = keyboard.nextInt();
		breloace +=breloaceAdaugate;
		if(breloace < 100){
				System.out.println( "You now have " + breloace + " keychains." );
		}else if(breloace ==100){
			System.out.println("We are out of stock!");
		}
	
		return breloace;
		
		
			

	}
}
