/**
 * Blue.java - 7/16/2019
 * Emily Kauffman
 * CS1530 - 1010 - Quiz4
 * Concrete class Blue that uses instance of Color
 */

public class Blue implements Color {
	
	@Override
	public void fill() {
		Random rand = new Random();
		int id = rand.nextInt(10000);       
		System.out.printf("BLUE ID: %d\n\n", id);
	}

}