package patterns.factoryMethod;

public class Main {
	public static void main (String[] args) {
		Creator creator1 = new CircleCreator();
		Figure figure = creator1.factoryMethod();
		figure.printSpecification();
		
		Creator creator2 = new TriangleCreator();
		figure = creator2.factoryMethod();
		figure.printSpecification();
	}
}