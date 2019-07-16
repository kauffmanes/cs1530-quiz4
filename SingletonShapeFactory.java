/**
 * SingletonShapeFactory.java - 7/16/2019
 * Emily Kauffman
 * CS1530 - 1010 - Quiz4
 * Makes sure application only has one instance of this factory
 */

public class SingletonShapeFactory {

	private static SingletonShapeFactory instance = new SingletonShapeFactory();

	/**
	 * Constructor
	 * 
	 * It's private so that it cannot be instantiated
	 */
	private SingletonShapeFactory() {
		System.out.println("Inside the shape factory constructor");
	}

	/**
	 * Get's the available instance
	 */
	public static SingletonShapeFactory getInstance() {
		return instance;
	}

	/**
	 * Returns a Shape based on what's requested
	 */
	public Shape getShape(String shapeType) {

		if (shapeType == null) {
			return null;
		}

		if (shapeType.equalsIgnoreCase("CIRCLE")) {
			return new Circle();
		}

		if (shapeType.equalsIgnoreCase("RECTANGLE")) {
			return new Rectangle();
		}

		if (shapeType.equalsIgnoreCase("SQUARE")) {
			return new Square();
		}

		return null;
	}


}