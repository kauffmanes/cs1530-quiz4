/**
 * Coarse.java - 7/16/2019
 * Emily Kauffman
 * CS1530 - 1010 - Quiz4
 * Concrete class for Coarse that uses instance of Texture
 */
import java.util.Random;

public class Coarse implements Texture {

	@Override
	public void texturize() {
		Random rand = new Random();
		int id = rand.nextInt(10000);       
		System.out.printf("Coarse ID: %d\n\n", id);
	}

}