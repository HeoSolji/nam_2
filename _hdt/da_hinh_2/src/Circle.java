/**
 * Created by Khiem472 on 09/10/2019.
 */

public class Circle extends Shape {
   private static final double PI = Math.PI;
   protected double radius;
   protected Point center;

   public Circle() {
   }

   public Circle(double radius) {
      setRadius(radius);
   }

   public Circle(double radius, String color, boolean filled) {
      super(color, filled);
      setRadius(radius);
   }

   public Circle(Point point, double radius, String color, boolean filled) {
      super(color, filled);
      setCenter(point);
      setRadius(radius);
   }

   public Point getCenter() {
      return center;
   }

   public void setCenter(Point center) {
      this.center = center;
   }

   public double getRadius() {
      return radius;
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }

   public double getArea() {
      return PI * getRadius() * getRadius();
   }

   public double getPerimeter() {
      return 2 * PI * getRadius();
   }

   @Override
   public int hashCode() {
      return getCenter().hashCode() * 7 + (int) radius * 13;
   }

   @Override
   public boolean equals(Object circle) {
      return true;
   }

   public String toString() {
      return "Circle[center=" + getCenter().toString() + ",radius=" + (double) Math.round(getRadius()) + ",color=" + getColor() + ",filled=" + isFilled() + "]";
   }
}

