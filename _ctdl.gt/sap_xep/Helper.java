package sap_xep;

public class Helper {
   public static void swap(int[] array, int i, int j) {
      int k = array[i];
      array[i] = array[j];
      array[j] = k;
   }
}