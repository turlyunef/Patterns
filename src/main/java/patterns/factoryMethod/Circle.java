package patterns.factoryMethod;

public class Circle implements Figure {

	private int radius;

	public Circle(int radius) {
		this.radius = radius;
	}

	@Override
	public void printSpecification() {
		System.out.println(getName() + getRadius());
	}

	private String getName() {

		return "Figure name is circle. ";
	}

	private String getRadius() {

		return String.format("Circle radius is %d", radius);
	}

}