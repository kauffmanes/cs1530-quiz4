/**
 * FactoryProducer.java - 7/16/2019
 * Emily Kauffman
 * CS1530 - 1010 - Quiz4
 * Produces Factories based on what's requested
 */

public class FactoryProducer {

	public static AbstractFactory getFactory(String factoryName) {

		if (factoryName.equalsIgnoreCase("SHAPE")) {
			return SingletonShapeFactory.getInstance();
		}

		if (factoryName.equalsIgnoreCase("COLOR")) {
			return SingletonColorFactory.getInstance();
		}

		if (factoryName.equalsIgnoreCase("TEXTURE")) {
			return SingletonTextureFactory.getInstance();
		}

		return null;
	}

}