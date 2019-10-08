
public class QuickSort {
   public static int partition(int[] a, int low, int high) {
      int i = low, j = high+1;

      while (true) {
         while (a[low] < a[--j])
            if (j == low) break;
         while (a[++i] < a[low])
            if (i == high) break;

         if (j <= i) break;
         Helper.swap(a, i, j);
      }

      Helper.swap(a, low, j);
      return j;
   }

   public static void sort(int[] array, int low, int high) {
      if (high <= low) return;
      int j = partition(array, low, high);
      sort(array, low, j-1);
      sort(array, j+1, high);
   }

   public static void sort(int[] array) {
      sort(array, 0, array.length-1);
   }
}