/*
7 kyu
Odd or Even?

https://www.codewars.com/kata/5949481f86420f59480000e7
*/

public class OddOrEven {
    
    public static void main(String[] args) {
        int[] array = {0, -1, -5};
        System.out.println(oddOrEven(array));
        
    }

    public static String oddOrEven (int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        if (sum % 2 == 0) {
            return "even";
        } else if (sum == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

}
