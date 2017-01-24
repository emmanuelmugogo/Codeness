
public class BeerSong {

	public static void main(String[] args) {
		int numberOfBottles = 100;
		
		singStanza(numberOfBottles);
		
		while(numberOfBottles >= 67) {
			//numberOfBottles = numberOfBottles - 1;  this is actually the same as the next line.
			numberOfBottles -= 1;
			singStanza(numberOfBottles);	
		}
		
		do {
			numberOfBottles -= 1; //or you can do numberOfBottles --;
			singStanza(numberOfBottles);
			
		}while (numberOfBottles > 50);
		
		for (int bottleCount = 49; bottleCount > 0; bottleCount--) {
			if (bottleCount > 1) {
				singStanza(bottleCount);
			}else {
				System.out.println("1 bottle of refreshing beverage on the wall, Take it Don't pass around.\n"
						+ "\nNo more bottles of refreshing beverage on the waaaaaaall!");
			}
			
		}
		
//		System.out.println("\nNo more bottles of refreshing beverage on the waaaaaaall!");
		

	}

	private static void singStanza(int numberOfBottles) {
		String bottleLyric = " bottles of refreshing beverage";
		System.out.println(numberOfBottles + bottleLyric + " on the wall." );
		System.out.println(numberOfBottles + bottleLyric + " Take one down, \npass it around. \n" );
	}

}
