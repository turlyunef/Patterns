package patterns.factoryMethod;

public class Triangle implements Figure {

	private int side1;
	private int side2;
	private int side3;

	public Triangle(int a, int b, int c) {
		this.side1 = a;
		this.side2 = b;
		this.side3 = c;
	}

	@Override
	public void printSpecification() {
		System.out.println(getName() + getLength());
	}

	private String getName() {

		return "Figure name is triangle. ";
	}

	private String getLength() {

		return String.format("Triangle length is %d, %d, %d", side1, side2, side3);
	}

}