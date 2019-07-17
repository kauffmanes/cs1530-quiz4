/**
 * AbstractFactoryTutorial.java - 7/16/2019
 * Emily Kauffman
 * CS1530 - 1010 - Quiz4
 * Driver to test the functionality of the application
 */

public class AbstractFactoryTutorial {

	public static void main(String[] args) {

		// does it a few times to demonstrate the IDs not changing
		for (int loop = 1; loop < 3; loop++) {

			System.out.println("New set:");

			// DRAWS A CIRCLE SHAPE
			AbstractFactory factory1 = FactoryProducer.getFactory("SHAPE");
			factory1.showMessage(); // Shape Factory ID: 5972
			Shape circle = factory1.getShape("CIRCLE"); // 
			circle.draw(); // Circle ID: 1879

			// DRAWS A RECTANGLE SHAPE
			AbstractFactory factory2 = FactoryProducer.getFactory("SHAPE");
			factory2.showMessage(); // Shape Factory ID: 5972
			Shape rectangle = factory2.getShape("RECTANGLE");
			rectangle.draw(); // Rectangle ID: 823

			// DRAWS A RED COLOR
			AbstractFactory factory3 = FactoryProducer.getFactory("COLOR");
			factory3.showMessage(); // Color Factory ID: 2155
			Color red = factory3.getColor("RED");
			red.fill(); // RED ID: 5268

			// DRAWS A GREEN COLOR
			AbstractFactory factory4 = FactoryProducer.getFactory("COLOR");
			factory4.showMessage(); // Color Factory ID: 2155
			Color green = factory4.getColor("GREEN");
			green.fill(); // GREEN ID: 6282

			// DRAWS A BLUE COLOR
			AbstractFactory factory5 = FactoryProducer.getFactory("COLOR");
			factory5.showMessage(); // Color Factory ID: 2155
			Color blue = factory5.getColor("BLUE");
			blue.fill(); // BLUE ID: 8976

			// DRAW SOMETHING COARSE
			AbstractFactory factory6 = FactoryProducer.getFactory("TEXTURE");
			factory6.showMessage(); 
			Texture coarse = factory6.getTexture("COARSE");
			coarse.texturize();

			// DRAW SOMETHING FINE
			AbstractFactory factory7 = FactoryProducer.getFactory("TEXTURE");
			factory7.showMessage(); 
			Texture fine = factory7.getTexture("FINE");
			fine.texturize();

		}
	}
}