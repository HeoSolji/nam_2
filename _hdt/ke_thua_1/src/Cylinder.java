
public class Cylinder extends Circle {
	
	private double height = 1.0;
	protected final double PI = Math.PI;
	
	public Cylinder() {}
	public Cylinder(double radius) {
		this.radius = radius;
	}
	public Cylinder(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	public Cylinder(double radius, double height, String color) {
		super(radius, color);
		this.height = height;
	}
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	
	public double getVolume() {
		return getArea() * height;
	}

	public String toString() {
		return "Cylinder[" + super.toString() + ",height=" + getHeight() + "]";
	}
	
	public double getArea() {
		return 2*PI*getRadius()*height + 2*super.getArea();
	}
}
