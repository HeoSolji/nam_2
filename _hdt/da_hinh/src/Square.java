/**
 * Created by Khiem472 on 08/10/2019.
 */
public class Square extends Rectangle {

   public Square() {}
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

   public double getSide() {
      return getLength();
   }
   public void setSide(double side) {
      setLength(side);
      setWidth(side);
   }

   @Override
   public void setWidth(double side) {
      super.setWidth(side);
      super.setLength(side);
   }

   @Override
   public void setLength(double side) {
      super.setLength(side);
      super.setWidth(side);
   }

   public String toString() {
      return "Square[side=" + getSide() + ",color=" + getColor() + ",filled=" + isFilled() + "]";
   }
}
