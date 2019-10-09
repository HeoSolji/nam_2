/**
 * Created by Khiem472 on 09/10/2019.
 */
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
      return "Rectangle[topLeft=" + getTopLeft().toString() + "width=" + (double) Math.round(getWidth()) + ",length=" + (double) Math.round(getLength()) + ",color=" + getColor() + ",filled=" + isFilled() + "]";
   }

   @Override
   public boolean equals(Object obj) {
      return super.equals(obj);
   }

   @Override
   public int hashCode() {
      return getTopLeft().hashCode() * 3 + (int) getWidth() * 5 + (int) getLength() * 7;
   }
}

