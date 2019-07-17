/**
 * SingletonColorFactory.java - 7/16/2019
 * Emily Kauffman
 * CS1530 - 1010 - Quiz4
 * Makes sure application only has one instance of this factory
 */
import java.util.Random;

public class SingletonColorFactory extends AbstractFactory {

	private static SingletonColorFactory instance = new SingletonColorFactory();
	private static int factoryID;

	/**
	 * Constructor
	 * 
	 * It's private so that it cannot be instantiated
	 */
	private SingletonColorFactory() {
		Random rand = new Random();
		factoryID = rand.nextInt(10000);
	}

	/**
	 * Get's the available instance
	 */
	public static SingletonColorFactory getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.printf("Color factory ID: %d\n", factoryID);
	}

	/**
	 * Returns a Color based on what's requested
	 */
	@Override
	public Color getColor(String colorType) {
		
		if(colorType == null){
			return null;
		}
		
		if(colorType.equalsIgnoreCase("RED")){
			return new Red();
		} else if(colorType.equalsIgnoreCase("GREEN")){
			return new Green();
		} else if(colorType.equalsIgnoreCase("Blue")){
			return new Blue();
		}
		
		return null;
		
	}

	/**
	 * Return a shape
	 */
	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	/**
	 * Return a texture
	 */
	@Override
	public Texture getTexture(String textureType) {
		return null;
	}

}