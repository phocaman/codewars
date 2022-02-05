/*
8 kyu
Find the First Non-Consecutive Number

https://www.codewars.com/kata/58f8a3a27a5c28d92e000144
*/

public class FindTheFirstNonConsecutiveNum {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 6, 7, 8};
        System.out.println(find(array));
        
    }

    static Integer find(final int[] array) {

        if (array.length == 0) {
            return null;
        }

        for (int i = 0; i < array.length - 1; i++) {
            if (array[i + 1] != array[i] + 1) {
                return array[i + 1];
            }
        } 
        return null;
    }

}