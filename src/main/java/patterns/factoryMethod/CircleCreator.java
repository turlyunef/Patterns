package patterns.factoryMethod;

public class CircleCreator extends Creator {

	@Override
	public Figure factoryMethod() {
		
		return new Circle(5);
	}
}