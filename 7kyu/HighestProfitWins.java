/*
7 kyu
The Highest Profit Wins!

https://www.codewars.com/kata/559590633066759614000063
*/

import java.util.Arrays;

public class HighestProfitWins {

    public static void main(String[] args) {

        int[] arr = {1,2,3,4,5};
        System.out.println(Arrays.toString(minMax(arr)));
        
    }

    public static int[] minMax(int[] arr) {
        
        int[] minMaxArr = new int[2];
        Arrays.sort(arr);
        minMaxArr[0] = arr[0];
        minMaxArr[1] = arr[arr.length - 1];
        return minMaxArr;

    }
    
}