
public class Circle extends Shape {
   protected double radius;
   private static final double PI = 3.14;

   public Circle() {}
   public Circle(double radius) {
      setRadius(radius);
   }
   public Circle(double radius, String color, boolean filled) {
      super(color, filled);
      setRadius(radius);
   }

   public void setRadius(double radius) {
      this.radius = radius;
   }
   public double getRadius() {
      return radius;
   }

   public double getArea() {
      return PI*radius*radius;
   }

   public double getPerimeter() {
      return 2*PI*radius;
   }

   public String toString() {
      return "Circle[radius=" + getRadius() + ",color=" + getColor() + ",filled=" + isFilled() + "]";
   }
}