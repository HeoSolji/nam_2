package sap_xep;

public class Shuffle {
   public static void shuffle(int[] array) {
      int N = array.length;
      for (int i = 0; i < N; ++i) {
         int j = (int) (Math.random()*(i+1));
         Helper.swap(array, i, j);
      }
   }
}