/*
6 kyu
Take a Number And Sum Its Digits Raised To The Consecutive Powers And ....¡Eureka!!

https://www.codewars.com/kata/5626b561280a42ecc50000d1
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SumOfConsecutivePowers {

    public static void main(String[] args) {
        
        long a = 1;
        long b = 100;
        System.out.println(sumDigPow(a, b));

    }

    public static List<Long> sumDigPow(long a, long b) {

        List<Long> result = new ArrayList<Long>();
        List<String> digits;
        String numbers;
        long sum = 0;
        long mult;

        for (long i = a; i <= b; i++) {
            numbers = String.valueOf(i);
            digits = Arrays.asList(numbers.split(""));
            for (int j = 0; j < digits.size(); j++) {
                mult = (long) Math.pow(Integer.parseInt(digits.get(j)), j + 1);
                sum += mult;
            }
            if (sum == i) {
                result.add(i);
            }
            sum = 0;
        }
        return result;
    }
    
}