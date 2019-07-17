/**
 * Green.java - 7/16/2019
 * Emily Kauffman
 * CS1530 - 1010 - Quiz4
 * Concrete class Green that uses instance of Color
 */

public class Green implements Color {
	 
	@Override
	public void fill() {
		Random rand = new Random();
		int id = rand.nextInt(10000);       
		System.out.printf("GREEN ID: %d\n\n", id);
	}

}