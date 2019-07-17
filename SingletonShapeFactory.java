/**
 * SingletonShapeFactory.java - 7/16/2019
 * Emily Kauffman
 * CS1530 - 1010 - Quiz4
 * Makes sure application only has one instance of this factory
 */
import java.util.Random;

public class SingletonShapeFactory extends AbstractFactory {

	private static SingletonShapeFactory instance = new SingletonShapeFactory();
	private static int factoryID;

	/**
	 * Constructor
	 * 
	 * It's private so that it cannot be instantiated
	 */
	private SingletonShapeFactory() {
		Random rand = new Random();
		factoryID = rand.nextInt(10000);
	}

	/**
	 * Get's the available instance
	 */
	public static SingletonShapeFactory getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.printf("Shape factory ID: %d\n", factoryID);
	}

	/**
	 * Returns a Shape based on what's requested
	 */
	@Override
	public Shape getShape(String shapeType) {
		
		if(shapeType == null){
			return null;
		}		
		
		if(shapeType.equalsIgnoreCase("CIRCLE")){
			return new Circle();
		} else if(shapeType.equalsIgnoreCase("RECTANGLE")){
			return new Rectangle();
		} else if(shapeType.equalsIgnoreCase("SQUARE")){
			return new Square();
		}
		
		return null;
		
	}

	/**
	 * Return a color
	 */
	@Override
	public Color getColor(String colorType) {
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