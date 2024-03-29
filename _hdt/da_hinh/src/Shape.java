public abstract class Shape {
   protected String color;
   protected boolean filled;

   public Shape() {}
   public Shape(String color, boolean filled) {
      setColor(color);
      setFilled(filled);
   }

   public void setColor(String color) {
      this.color = color;
   }
   public String getColor() { return color; }
   public void setFilled(boolean filled) {
      this.filled = filled;
   }
   public boolean isFilled() {
      return filled;
   }

   public abstract double getArea();
   public abstract double getPerimeter();
   public String toString() {
      return "Shape[color=" + getColor() + ",filled=" + isFilled() + "]";
   }
}