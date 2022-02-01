/*
8 kyu
Find the Smallest Integer in the Array

https://www.codewars.com/kata/55a2d7ebe362935a210000b2
*/

import java.util.*;

public class FindTheSmallestInt {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(findSmallestInt(arr));
        
    }

    public static int findSmallestInt(int[] arr) {
      
        Arrays.sort(arr);
      
        return arr[0];

    }

}
