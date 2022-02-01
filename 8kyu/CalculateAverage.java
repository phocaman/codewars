/*
8 kyu
Calculate Average

https://www.codewars.com/kata/57a2013acf1fa5bfc4000921
*/

public class CalculateAverage {

    public static void main(String[] args) {
        int[] array = {2, 2, 2};
        System.out.println(findAverage(array));
    }

    public static double findAverage(int[] array) {

        double sum = 0;
        if (array.length == 0) {
            return 0;
        } else {
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
        }
        return sum / array.length;
    }
}
