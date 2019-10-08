public class QuickSort3Way {
   public static void sort(int[] array, int low, int high) {
      if (hi <= low) return;
      int lt = low, gt = high, i = low;
      int pivot = array[low];
      while (i <= gt) {
         if (array[i] > v) {
            swap(array, i, gt--);
         } else if (array[i] < v) {
            swap(array, i++, lt++);
         } else ++i;
      }
      sort(array, low, lt-1);
      sort(array, gt+1, high);
   }
}