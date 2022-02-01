/*
8 kyu
Count of Positives / Sum of Negatives

Given an array of integers.
Return an array, where the first element is the count of positives numbers
and the second element is sum of negative numbers. 0 is neither positive nor negative.
If the input array is empty or null, return an empty array.
Example:
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].

https://www.codewars.com/kata/576bb71bbbcf0951d5000044
*/

import java.util.Arrays;

public class CountPositivesSumNegatives {

    public static void main(String[] args) {

        int[] input = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15};
        System.out.println(Arrays.toString(countPositivesSumNegatives(input)));
        
    }

    public static int[] countPositivesSumNegatives(int[] input) {

        if (input == null || input.length == 0) {
            return new int[0];
        }

        int[] output = new int[2];

        int counter = 0;
        int sum = 0;

        for (int i = 0; i < input.length; i++) {
            if (input[i] != 0) {
                if (input[i] > 0) {
                    counter += 1;
                    output[0] = counter;
                } else {
                    sum += input[i];
                    output[1] = sum;
                }
            }
        }
        return output;
    }
}

        

    
    

