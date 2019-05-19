package patterns.factoryMethod;

public class TriangleCreator extends Creator{

	@Override
	public Figure factoryMethod() {
		
		return new Triangle(2, 3, 5);
	}

}
