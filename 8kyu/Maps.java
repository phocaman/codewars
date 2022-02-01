/*
8 kyu
Beginner - Lost Without a Map

https://www.codewars.com/kata/57f781872e3d8ca2a000007e
*/

import java.util.Arrays;

public class Maps {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(Arrays.toString(map(array)));
    }

    public static int[] map(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * 2;
        }
        return arr;
    }
    
}
