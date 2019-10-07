package sap_xep;

public class MergeSort {
   private static void merge(int[] arr, int[] aux, int low, int mid, int high) {
      for (int i = low; i <= high; ++i) aux[i] = arr[i];

      int i = low, j = mid+1;
      for (int k = low; k <= high; ++k) {
         if      (i > mid)          arr[k] = aux[j++];
         else if (j > high)         arr[k] = aux[i++];
         else if (aux[i] <= aux[j]) arr[k] = aux[i++];
         else                       arr[k] = aux[j++];
      }
   }

   private static void sort(int[] arr, int[] aux, int low, int high) {
      if (high <= low) return;
      int mid = low + (high-low) / 2;
      sort(arr, aux, low, mid);
      sort(arr, aux, mid+1, high);
      merge(arr, aux, low, mid, high);
   }

   public static void sort(int[] arr) {
      int[] aux = new int[arr.length];
      sort(arr, aux, 0, arr.length-1);
   }
}