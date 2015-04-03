public class Circle {

	double radius;

	double area() {
		return radius * radius * 3.14;
	}

	double circumferences() {
		return 2 * 3.14 * radius;
	}

	double getRadius() {
		return radius;
	}

	void setRadius(double r) {
		radius = r;
	}
	
	public Circle() {
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}
	
	

}