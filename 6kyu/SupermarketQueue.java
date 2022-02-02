/*
6 kyu
The Supermarket Queue

https://www.codewars.com/kata/57b06f90e298a7b53d000a86/train/java
*/

import java.util.*;

public class SupermarketQueue {

    public static void main(String[] args) {

        int[] customers = { 2, 2, 3, 3, 4, 4 };
        int n = 2;
        System.out.println(solveSuperMarketQueue(customers, n));
        
    }

    public static int solveSuperMarketQueue(int[] customers, int n) {

        int[] result = new int[n];
        for (int i = 0; i < customers.length; i++) {
            result[0] += customers[i];
            Arrays.sort(result);
        }
        return result[n - 1];
    }

}