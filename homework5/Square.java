package homework5;
import java.util.Objects;

public class Square extends Shape {

	public double a;

	public Square(double a) {
		super("square");
		this.a = a;
	}

	@Override
	void draw() {
		System.out.println(shapeName + "has been drawn");
		System.out.println("square edge : " + a);
	}

	@Override
	void erase() {
		super.erase();
	}

	@Override
	double calculateArea() {
		double area = a * a;
		System.out.println("square area : " + area);
		return area;
	}

	@Override
	double calculateCircumference() {
		double circumference = 4 * a;
		System.out.println("square circumference : " + circumference);
		return circumference;
	}

	@Override
	public int hashCode() {
		return Objects.hash(a);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Square other = (Square) obj;
		return a == other.a;
	}

	@Override
	public String toString() {
		return "square [a = " + a + "]";
	}
}