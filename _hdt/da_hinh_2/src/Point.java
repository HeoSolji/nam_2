/**
 * Created by Khiem472 on 09/10/2019.
 */
public class Point {

   private double x;
   private double y;

   public Point(double x, double y) {
      setX(x);
      setY(y);
   }

   public double getX() {
      return x;
   }

   public void setX(double x) {
      this.x = x;
   }

   public double getY() {
      return y;
   }

   public void setY(double y) {
      this.y = y;
   }

   public double distance(Point other) {
      double dis = Math.sqrt(Math.pow((getX() - other.getX()), 2) + Math.pow(getY() - other.getY(), 2));
      return Math.round(dis * 10) / 10;
   }

   @Override
   public boolean equals(Object obj) {
      if (obj instanceof Point) {
         if (this.getX() == ((Point) obj).getX() && this.getY() == ((Point) obj).getY())
            return true;
         else return false;
      }
      return false;
   }

   @Override
   public String toString() {
      return "(" + x + "," + y + ")";
   }
}
