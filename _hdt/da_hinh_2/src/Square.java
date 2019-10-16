/**
 * Created by Khiem472 on 08/10/2019.
 */
import java.util.Objects;
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
   public boolean equals(Object o) {
      if (this == o) return true;
      if (!(o instanceof Square)) return false;
      Square square = (Square) o;
      return Double.compare(square.width, width) == 0 && Double.compare(square.length, length) == 0 && Objects.equals(topLeft, square.topLeft);
   }

   public String toString() {
      return "Square[topLeft=" + topLeft + ",side=" + getSide() + ",color=" + color + ",filled=" + filled + "]";
   }
}
