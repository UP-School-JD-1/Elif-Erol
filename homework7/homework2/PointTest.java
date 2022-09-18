package homework2;

public class PointTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point c1= new Point(22,23);
		Point e1= new Point(94,96);
		
		System.out.println("P1 values"+" x: " +c1.x +" y:  "+ c1.y);
		System.out.println("P2 values"+" x: " +e1.x +" y:  "+ e1.y);
		
		c1.setX(10);
		c1.setY(20);
		e1.setX(30);
		e1.setY(40);
		
		double distance = c1.distanceFromAnotherPoint(e1);
		System.out.println("distance between two points:"+ distance);
		double origin=c1.distanceFromTheOrigin();
		System.out.println("P1 distance of from:  "+origin );
		
		Point d1 = c1.clone();
		d1.move('y',3);
		System.out.println("P3 values :  "+" x: " +d1.x +" y:  "+ d1.y);
		
		c1.move('x', 22);
		System.out.println("P1 values "+" x: " +c1.x +" y:  "+ c1.y);
		
		e1.move('y', 23);
		System.out.println("P2 values "+" x: " +e1.x +" y:  "+ e1.y);
	}
}

		
	
	
	