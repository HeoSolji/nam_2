// package task1;
import java.util.Scanner;

public class Week3Task1 {
	// compute greatest common divisor of $a and $b
	public int gcd(int a, int b) {
		if (b == 0) return a;
		else return gcd(b, a%b);
		// return;
	}

	// compute the fibonacci of $n
	public int fibonacci(int n) {
		if (n <= 1) return n;
		else return fibonacci(n-1) + fibonacci(n-2);
	}

	/**
	* print all prime numbers from 0 to $n use Sieve of Eratosthenes algorithm
	* useful link https://en.wikipedia.org/wiki/Sieve_of_Eratosthenes
	* notice that print each number in a line
	* @param n
	*/
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
		Week3Task1 iLove = new Week3Task1();
		Scanner baQue = new Scanner(System.in);
		int Terry = baQue.nextInt();
		int Truong = baQue.nextInt();
		System.out.println(iLove.gcd(Terry, Truong));
		int TranDan = baQue.nextInt();
		iLove.primes(TranDan);
	}
}