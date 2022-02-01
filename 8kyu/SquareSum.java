/*
8 kyu
Square(n) Sum

https://www.codewars.com/kata/515e271a311df0350d00000f
*/

public class SquareSum {

    public static void main(String[] args) {
        int[] array = {1, 2, 3};
        System.out.println(squareSum(array));
    }

    public static int squareSum(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.pow(array[i], 2);
            sum += array[i];
            }
        return sum;
    }
    
}
