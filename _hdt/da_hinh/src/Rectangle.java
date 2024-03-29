public class Rectangle extends Shape {
   protected double width;
   protected double length;

   public Rectangle() {}
   public Rectangle(double width, double length) {
      setWidth(width);
      setLength(length);
   }
   public Rectangle(double width, double length, String color, boolean filled) {
      super(color, filled);
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

   public double getArea() {
      return getWidth()*getLength();
   }
   public double getPerimeter() {
      return 2*(getWidth()+getLength());
   }

    public String toString() {
      return "Rectangle[width=" + getWidth() + ",length=" + getLength() + ",color=" + getColor() + ",filled=" + isFilled() + "]";
    }
}
