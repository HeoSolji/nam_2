
/**
 * Created by Khiem472 on 09/10/2019.
 */
import java.util.Objects;
public class Rectangle extends Shape {
   protected double width;
   protected double length;
   protected Point topLeft;

   public Rectangle() {
   }

   public Rectangle(double width, double length) {
      setWidth(width);
      setLength(length);
   }

   public Rectangle(double width, double length, String color, boolean filled) {
      super(color, filled);
      setWidth(width);
      setLength(length);
   }

   public Rectangle(Point point, double width, double length, String color, boolean filled) {
      super(color, filled);
      setTopLeft(point);
      setWidth(width);
      setLength(length);
   }

   public double getWidth() {
      return width;
   }

   public void setWidth(double width) {
      this.width = width;
   }

   public double getLength() {
      return length;
   }

   public void setLength(double length) {
      this.length = length;
   }

   public Point getTopLeft() {
      return topLeft;
   }

   public void setTopLeft(Point topLeft) {
      this.topLeft = topLeft;
   }

   public double getArea() {
      return getWidth() * getLength();
   }

   public double getPerimeter() {
      return 2 * (getWidth() + getLength());
   }

   public String toString() {
      return "Rectangle[topLeft=" + topLeft + ",width=" + width + ",length=" + length + ",color=" + color + ",filled=" + filled + "]";
   }

   @Override
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Rectangle)) return false;
      Rectangle rectangle = (Rectangle) o;
      return Double.compare(rectangle.width, width) == 0 && Double.compare(rectangle.length, length) == 0 && Objects.equals(topLeft, rectangle.topLeft);
   }

   @Override
   public int hashCode() {
      return getTopLeft().hashCode() * 3 + (int) getWidth() * 5 + (int) getLength() * 7;
   }
}

