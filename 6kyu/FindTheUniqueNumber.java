/*
6 kyu
Find the Unique Number

https://www.codewars.com/kata/585d7d5adb20cf33cb000235
*/

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheUniqueNumber {

    public static void main(String[] args) {

        double[] arr = {1, 1, 1, 2, 1, 1};
        System.out.println(findUniq(arr));
        
    
    }

    public static double findUniq(double[] arr) {
        
        return Arrays.stream(arr).boxed()
            .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
            .entrySet()
            .stream()
            .filter(i -> i.getValue() == 1)
            .findFirst().get().getKey();
        
    }
    
}