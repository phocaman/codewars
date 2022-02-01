/*
8 kyu
Invert Values

https://www.codewars.com/kata/5899dc03bc95b1bf1b0000ad
*/

import java.util.Arrays;

public class InvertValues {

    public static void main(String[] args) {
        int[] array = {1, -2, 3, -4, 5, -6, 7, 8, 9, 0};
        System.out.println(Arrays.toString(invert(array)));
    }

    public static int[] invert(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = array[i] * -1;
        }
        return array;
    }
    
}
