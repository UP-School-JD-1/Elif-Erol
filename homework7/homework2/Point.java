package homework2;

public class Point {
	double x;
	double y ;
	
	public Point(double x2 , double y2) {
		this.x=x2;
		this.y=y2;
	}
	
	public int getX() {
		return (int) x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return (int)y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public double distanceFromTheOrigin() {
		return Math.sqrt(x*x + y*y);
	}
	public double distanceFromAnotherPoint(Point point) {
		return Math.sqrt(Math.pow((x - point.x), 2) + Math.pow((y - point.y), 2));
	}
	
	public Point clone() {
		Point point = new Point(x, y);
		return point;
	}
	
	public void move(char direction , int quantity) {
		if(direction =='x') {
			x += quantity;
		}
		else if(direction=='y') {
			y += quantity;
		}
		
	}
	
}