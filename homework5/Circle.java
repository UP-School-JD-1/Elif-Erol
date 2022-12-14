package homework5;

import java.util.Objects;

public class Circle extends Shape {

    double r;

	Circle(double r) {
		super("circle");
		this.r = r;
	}

	@Override
	void draw() {
		super.draw();
		System.out.println("circle radius : " + r);
	}

	@Override
	void erase() {
		super.erase();
	}

	@Override
	double calculateArea() {
		double area = Math.PI * (r * r);
		System.out.println("circle area : " + area);
		return area;
	}

	@Override
	double calculateCircumference() {
		double circumference = 2 * Math.PI * r;
		System.out.println("Circle circumference : " + circumference);
		return circumference;
	}

	@Override
	public
	int hashCode() {
		return Objects.hash(r);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Circle other = (Circle) obj;
		return r == other.r;
	}

	@Override
	public String toString() {
		return "circle radius = " + r + " ";
	}
}