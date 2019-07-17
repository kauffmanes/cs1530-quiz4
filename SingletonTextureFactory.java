/**
 * SingletonTextureFactory.java - 7/16/2019
 * Emily Kauffman
 * CS1530 - 1010 - Quiz4
 * Makes sure application only has one instance of this factory
 */
import java.util.Random;

public class SingletonTextureFactory extends AbstractFactory {

	private static SingletonTextureFactory instance = new SingletonTextureFactory();
	private static int factoryID;

	/**
	 * Constructor
	 * 
	 * It's private so that it cannot be instantiated
	 */
	private SingletonTextureFactory() {
		Random rand = new Random();
		factoryID = rand.nextInt(10000);
	}

	/**
	 * Get's the available instance
	 */
	public static SingletonTextureFactory getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.printf("Texture factory ID: %d\n", factoryID);
	}

	/**
	 * Returns a Shape based on what's requested
	 */
	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	/**
	 * Return a color
	 */
	@Override
	public Color getColor(String colorType) {
		return null;
	}

	@Override
	public Texture getTexture(String textureType) {

		if(textureType == null){
			return null;
		}
		
		if(textureType.equalsIgnoreCase("COARSE")){
			return new Coarse();
		} else if(textureType.equalsIgnoreCase("FINE")){
			return new Fine();
		}
		
		return null;

	}

}