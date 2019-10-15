/**
 * Created by Khiem472 on 08/10/2019.
 */
public class Square extends Rectangle {

   public Square() {
   }

   public Square(double side) {
      setWidth(side);
      setLength(side);
   }

   public Square(double side, String color, boolean filled) {
      setWidth(side);
      setLength(side);
      setColor(color);
      setFilled(filled);
   }

   public Square(Point point, double side, String color, boolean filled) {
      super(point, side, side, color, filled);
   }

   public double getSide() {
      return getLength();
   }

   public void setSide(double side) {
      setLength(side);
      setWidth(side);
   }

   @Override
   public void setWidth(double side) {
      width = side;
      length = side;
   }

   @Override
   public void setLength(double side) {
      width = side;
      length = side;
   }

   @Override
   public int hashCode() {
      return getTopLeft().hashCode() * 6 + (int) getSide() * 21;
   }

   @Override
   public boolean equals(Object obj) {
       if (obj instanceof Square) {
          return super.equals(obj);
       }
       return false;
   }

   public String toString() {
      return "Square[topLeft=" + getTopLeft().toString() + "side=" + getSide() + ",color=" + getColor() + ",filled=" + isFilled() + "]";
   }
}
