/*
7 kyu
Find the Stray Number

https://www.codewars.com/kata/57f609022f4d534f05000024
*/

public class FindTheStrayNumber {

    public static void main(String[] args) {

        int[] numbers = {2, 1, 1};
        System.out.println(stray(numbers));
        
    }

    public static int stray(int[] numbers) {

        for (int i = 0; i < numbers.length;) {
            if (numbers[0] != numbers[1]) {
                return numbers[0];
            }
            int result = 0;
            for (int j = 1; j < numbers.length; j++) {
                 if (numbers[j] != numbers[i]) {
                    result = numbers[j];
                }
            }
            return result;
        }
        return 0; 
    }
    
}