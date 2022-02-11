/*
6 kyu
Sort the Odd

https://www.codewars.com/kata/578aa45ee9fd15ff4600090d
*/

import java.util.Arrays;
import java.util.PrimitiveIterator.OfInt;
import java.util.stream.IntStream;

/**
 * SortTheOdd
 */
public class SortTheOdd {

    public static void main(String[] args) {

        int[] array = {9, 8, 7, 6, 5, 4, 3, 2, 1, 0};
        System.out.println(Arrays.toString(sortArray(array)));
        
    }

    public static int[] sortArray(int[] array) {

        OfInt sortedArray = IntStream.of(array).filter(i -> i % 2 != 0).sorted().iterator();
 
        return IntStream.of(array).map(i -> i % 2 == 0 ? i : sortedArray.nextInt()).toArray();  
    
    }

}