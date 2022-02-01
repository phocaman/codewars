/*
8 kyu
Fake Binary

Given a string of digits, you should replace any digit below 5 with '0'
and any digit 5 and above with '1'. Return the resulting string.

Note: input will never be an empty string

https://www.codewars.com/kata/57eae65a4321032ce000002d
*/

import java.util.Arrays;

public class FakeBinary {

    public static void main(String[] args) {

        String numberString = "366058562030849490134388085";
        System.out.println(fakeBin(numberString));
        
    }

    public static String fakeBin(String numberString) {
    
        int[] numbers = Arrays.stream(numberString.split(""))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        int[] result = Arrays.stream(numbers)
                        .map(i -> i < 5 ? 0 : 1)
                        .toArray();
        String[] output = Arrays.stream(result)
                        .mapToObj(String::valueOf)
                        .toArray(String[]::new);
        
        return String.join("", output);

    }
    
}
