/*
8 kyu
Find Maximum and Minimum Values of a List

https://www.codewars.com/kata/577a98a6ae28071780000989/train/java
*/

import java.util.Arrays;

public class FindMaxAndMinVal {

    public static void main(String[] args) {

        int[] list = {-52, 56, 30, 29, -54, 0, -110};
        System.out.println(min(list));
        System.out.println(max(list));
        
    }

    public static int min(int[] list) {
        
        Arrays.sort(list);
        return list[0];

    }
      
    public static int max(int[] list) {
        
        Arrays.sort(list);
        return list[list.length - 1];

    }

}