/*
4 kyu
Number of Proper Fractions with Denominator d

https://www.codewars.com/kata/55b7bb74a0256d4467000070
*/

/**
 * NumberOfProperFractions
 */

 public class NumberOfProperFractions {

    public static void main(String[] args) {

        long n = 1;
        System.out.println(properFractions(n));
        
    }

    public static long properFractions(long n) {

        if (n == 1) {
            return 0;
        }

        long totient = n;
        
        for (long prime = 2; prime * prime <= n; prime++) {
            if (n % prime == 0) {
                totient /= prime;
                totient *= (prime - 1);
                while (n % prime == 0) {
                    n /= prime;
                }
            }
        }
        
        if (n > 1) {
            totient /= n;
            totient *= (n - 1);
        }
        return totient;
    }

}