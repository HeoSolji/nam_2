package sap_xep;

class InsertionSort {   
   public static void sort(int[] array) {
      int n = array.length;
      for (int i = 1; i < n; ++i) {
         for (int j = i; j > 0 && array[j] < array[j-1]; --j) {
            int c = array[j];
            array[j] = array[j-1];
            array[j-1] = c;
         }
      }
   }
}