package homework5;


public class ShapeTest {
	public static void main(String[] args) {
		Circle c1 = new Circle(30);
		Circle c2 = new Circle(20);

		Rectangle r1 = new Rectangle(10, 20);
		Rectangle r2 = new Rectangle(20, 40);

		Square s1 = new Square(2);
		Square s2 = new Square(2);

		Triangle t1 = new Triangle(6, 6, 9);
		Triangle t2 = new Triangle(9, 8, 7);

		c1.draw();
		c1.calculateArea();
		c1.calculateCircumference();
		c1.erase();
		System.out.println("Circle1 hashcode = " + c1.hashCode());
		System.out.println("Circle1 hashcode = " + c2.hashCode());
		System.out.println("Circle1 and circle2 are equals = " + c1.equals(c2));
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		System.out.println();

		r1.draw();
		r1.calculateArea();
		r1.calculateCircumference();
		r1.erase();
		System.out.println("Rectangle1 hashcode = " + r1.hashCode());
		System.out.println("Rectangle2 hashcode = " + r2.hashCode());
		System.out.println("Rectangle1 and rectangle2 are equals = " + r1.equals(r2));
		System.out.println(r1.toString());
		System.out.println(r2.toString());
		System.out.println();

		s1.draw();
		s1.calculateArea();
		s1.calculateCircumference();
		s1.erase();
		System.out.println("Square1 hashcode = " + s1.hashCode());
		System.out.println("Square2 hashcode = " + s2.hashCode());
		System.out.println("Square1 and square2 are equals  = " + s1.equals(s2));
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println();

		t1.draw();
		t1.calculateArea();
		t1.calculateCircumference();
		t1.erase();
		System.out.println("Triangle1 hashcode = " + t1.hashCode());
		System.out.println("Triangle2 hashcode = " + t2.hashCode());
		System.out.println("Triangle1 and triangle2 are equals = " + t1.equals(t2));
		System.out.println(t1.toString());
		System.out.println(t2.toString());
	}
}
