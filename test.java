//Language:Java
import java.util.ArrayList;
import java.util.Scanner;

class test {

   public static int search(ArrayList<Integer> arr, int key, int low, int high) {
      // while (low <= high) {
      //    int mid = low + (high-low)/2;
      //    if (key < arr.get(mid)) high = mid-1;
      //    else if (key > arr.get(mid)) low = mid+1;
      //    else return mid;
      // }
      for (int i = low+1; i <= high; i++) {
         if (key == arr.get(i)) return i;
      }
      return -1;
   }

   public static void print(ArrayList<Integer> arr) {
      for (Integer var : arr) {
         System.out.print(var + " ");
         System.out.println();
      }
   }

   public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         ArrayList<Integer> array = new ArrayList<Integer>();
         //array.add(0);
         ArrayList<Integer> kq = new ArrayList<Integer>();
         int n = sc.nextInt();
         int k = sc.nextInt();
         for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            array.add(x);
         }

         sc.close();
         for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; ++j) {
               if (array.get(i) + array.get(j) == k) {
                  kq.add(i);
                  kq.add(j);
                  break;
               }
            }
         }

         if (kq.isEmpty()) {
            System.out.println(-1);
         } else {
            // int o = search(array, k-array.get(i), i, n-1);
            // // System.out.println("tim tai" + o);
            // if (o != -1) {
            

            // System.out.print("ket qua: " );
            
            

            int max = 99999999, moc = 0;
            //kq.add(0, 0);
      
            for (int j = 0; j < kq.size()-1; j += 2) {
               if (kq.get(j)*n + kq.get(j+1) < max) {
                  max = kq.get(j)*n + kq.get(j+1);
                  moc = j;
               }
            }
       
            System.out.println((kq.get(moc)+1) + " " + (kq.get(moc+1)+1));
         }
         
   } 
      

      // for (int var : array) {
      //    System.out.println(var);
      // }
}