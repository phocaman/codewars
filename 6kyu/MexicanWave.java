/*
6 kyu
Mexican Wave

https://www.codewars.com/kata/58f5c63f1e26ecda7e000029
*/

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * MexicanWave
 */
public class MexicanWave {

    public static void main(String[] args) {
        
        String str = "two words";
        System.out.println(Arrays.toString(wave(str)));

    }

    public static String[] wave(String str) {

        return IntStream
                .range(0, str.length())
                .mapToObj(x -> new StringBuilder(str).replace(x, x + 1, String.valueOf(str.charAt(x)).toUpperCase()).toString())
                .filter(x -> !x.equals(str))
                .toArray(String[]::new);
    
    }

}