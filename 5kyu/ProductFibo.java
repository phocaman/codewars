/*
5 kyu
Product of Consecutive Fib Numbers

https://www.codewars.com/kata/5541f58a944b85ce6d00006a
*/

import java.util.Arrays;

public class ProductFibo {

    public static void main(String[] args) {

        long prod = 4895;
        System.out.println(Arrays.toString(productFib(prod)));
        
    }

    public static long[] productFib(long prod) {

        long previous = 0;
        long current = 1;
        long product = previous * current;

        while (product < prod) {
            long temp = current;
            current += previous;
            previous = temp;
            product = previous * current;
        }

        return new long[] { previous, current, product == prod ? 1 : 0 };

    }
    
}
