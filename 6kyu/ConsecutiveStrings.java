import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/*
6 kyu
Consecutive Strings

https://www.codewars.com/kata/56a5d994ac971f1ac500003e/train/java
*/

/**
 * ConsecutiveStrings
 */
public class ConsecutiveStrings {

    public static void main(String[] args) {

        String[] strarr = {"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"};
        int k = 2;
        System.out.println(longestConsec(strarr, k));

    }

    public static String longestConsec(String[] strarr, int k) {
        
        if (strarr.length == 0 || k > strarr.length || k <= 0) {
            return "";
        }

        return IntStream.rangeClosed(0, strarr.length - k)
                        .mapToObj(i -> Arrays.stream(strarr, i, i + k)
                        .collect(Collectors.joining()))
                        .max(Comparator.comparingInt(String::length))
                        .orElse("");
    
    }

}