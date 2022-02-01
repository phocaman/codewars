/*
8 kyu
Convert Number to Reversed Array of Digits

https://www.codewars.com/kata/5583090cbe83f4fd8c000051
*/

import java.util.stream.IntStream;

public class NumToReversedArray {

    public static void main(String[] args) {
        long n = 123456789;
        System.out.println(digitize(n));
        
    }

    public static int[] digitize(long n) {
        
        String longToString = String.valueOf(n);
        
        return IntStream.range(0, longToString.length()).map(i -> Character.digit(longToString.charAt(longToString.length() - i - 1), 10)).toArray();
    
    }
}
