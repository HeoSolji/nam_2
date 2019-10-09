/**
 * Created by Khiem472 on 09/10/2019.
 */
public class Main {
   public static void main(String[] args) {
      Point point = new Point(2.555, 9.57);
      Circle circle1 = new Circle(point, 2.53, "orange", true);

      Square square = new Square(point, 2.2, "black", true);

      Circle circle2 = new Circle(point, 2.53, "red", false);
      Layer screen = new Layer();
      screen.addShape(circle1);
      screen.addShape(square);
      screen.addShape(circle2);
      screen.removeDuplicates();
      System.out.print(screen.getInfo());
   }

}
