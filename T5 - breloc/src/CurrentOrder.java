
public class CurrentOrder {

	public void viewOrder(int breloace, int cost){
		System.out.println("You have " + breloace + " keychains." );
		System.out.println("Keychains cost $ " + cost + " each.");
		System.out.println("Total cost is $ " + (breloace*cost) + " .\n" );
	}
}
