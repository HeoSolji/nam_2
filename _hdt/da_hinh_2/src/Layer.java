import java.util.ArrayList;
import java.util.List;

/**
 * Created by Khiem472 on 09/10/2019.
 */
public class Layer {
   private List<Shape> shapes = new ArrayList<>();

   public void addShape(Shape shape) {
      shapes.add(shape);
   }

   public String getInfo() {
      String s = "Layer of crazy shapes: \n";
      for (Object o : shapes)
         s += (o.toString() + "\n");
      return s;
   }

   public void removeCircles() {
      if (shapes == null) return;
      for ( int i = 0 ; i < shapes.size(); i++){
         if ( shapes.get(i) instanceof Circle ){
            shapes.remove(i);
         }
      }
   }

   public void removeDuplicates() {
      if (shapes == null) return;
      for (int i = 0 ; i < shapes.size(); i++) {
         if (shapes.get(i) instanceof Circle) {
            for (int j = i + 1 ; j < shapes.size(); j++) {
               if (shapes.get(i).hashCode() == shapes.get(j).hashCode()) {
                  shapes.remove(j);
               }
            }
         }
         if (shapes.get(i) instanceof Rectangle) {
            for (int j = i + 1 ; j < shapes.size(); j++) {
               if (shapes.get(i).hashCode() == shapes.get(j).hashCode()) {
                  shapes.remove(j);
               }
            }
         }
      }
   }
}
