package sap_xep;

//import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      //Scanner sc = new Scanner(System.in);
      //int n;
      // n = sc.nextInt();
      int[] array = new int[30];
      for (int i = 0; i < 30; ++i) {
         array[i] = (int) (Math.random() * 50);
      }
      
      MergeSort.sort(array);
      //Shuffle.shuffle(array);
      for (int x : array) {
         System.out.print(x + " ");
      }
   }
}