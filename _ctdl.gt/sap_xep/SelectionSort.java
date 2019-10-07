package sap_xep;

public class SelectionSort {
   public static void sort(int[] array) {
      int n = array.length;
      for (int i = 0; i < n; i++) {
         int min = i;
         for (int j = i+1; j < n; j++) {
            if (array[j] < array[min]) {
               min = j;
            }
         }
         Helper.swap(array, i, min);
      }
   }
}
