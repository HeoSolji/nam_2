//import your library
import java.util.Scanner;
public class Solution {
//Type your main code here
    public void primes(int n) {
      boolean[] isNOTPrime = new boolean[n+1];
      for (int i = 2; i*i <= n; ++i) {
        if (isNOTPrime[i] == false) {
          for (int j = i*2; j <= n; j += i)
            isNOTPrime[j] = true;
        }
      }

      for (int i = 2; i <= n; ++i) {
        if (isNOTPrime[i] == false)
          System.out.print(i + " ");
      }
    }

    public static void main(String[] args) {
      Solution iLove = new Solution();
      Scanner baQue = new Scanner(System.in);
      //int TerryTruong = baQue.nextInt();
      //int Truong = baQue.nextInt();
      int TranDan = baQue.nextInt();
      //System.out.println(iLove.gcd(TerryTruong, TranDan));
      iLove.primes(TranDan);
   }
}