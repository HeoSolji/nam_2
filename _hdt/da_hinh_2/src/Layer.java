import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * Created by Khiem472 on 09/10/2019.
 */
public class Layer {
   public static ArrayList<Shape> list = new ArrayList<Shape>();

   public void addShape(Shape shape) {
      list.add(shape);
   }

   public String getInfo() {
      String s = "Layer of crazy shapes:\n";
      for (Object o : list)
         s += (o.toString() + "\n");
      return s;
   }

   public void removeCircles() {
      list.removeIf(shape -> (shape instanceof Circle));
   }

   public void removeDuplicates() {
      LinkedHashSet<Shape> set = new LinkedHashSet<Shape>(list);
      ArrayList<Shape> ls = new ArrayList<>(set);
      list = ls;
   }
}
