import java.util.Scanner;

public class PrimeNumbers {

	void checkForPrimes(int n) {
		// Test Commit for launching Jenkins build  //
		// Check for Primes Method //
		boolean primeList[] = new boolean[n+1];
		// Creating an array of all numbers up to n //
		// and setting them equal to true. We will check to //
		// which ones are not primes and set to false //
		for(int i=0;i<=n;i++) {
			primeList[i] = true;
		}
		
		for(int p = 2; p*p <= n; p++) {
			if (primeList[p] == true) {
				for(int x = p*p; x <= n; x += p) {
					//System.out.println("Checking: " + x);
					primeList[x] = false;
				}
			}
		}
		
		// Print out all the prime numbers //
		for (int y = 2; y <= n; y++) {
			if (primeList[y] == true) {
				System.out.println(y + " ");
			}
		}
	}
	public static void main(String[] args) {
		// Check to see if argument is passed in //
		// Otherwise Prompt the user to enter a maximum integer
		Scanner myScanner = new Scanner(System.in);
		int maxNumber = 0;
		if (args.length == 0) {
			System.out.println("Enter a maxiumum integer to check: ");
			maxNumber = myScanner.nextInt();
		}
		else {
			maxNumber = Integer.valueOf(args[0]);
		}
		//int maxNumber = myScanner.nextInt();
		System.out.println("Checking for all primes less than " + maxNumber);
		PrimeNumbers p = new PrimeNumbers();
		// Call checkForPrimes to check for all numbers up to maxNumber which are Primes //
		p.checkForPrimes(maxNumber);
		myScanner.close();
	}

}
