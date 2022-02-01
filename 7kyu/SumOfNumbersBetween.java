/*
7kyu
Beginner Series #3 Sum of Numbers

Given two integers a and b, which can be positive or negative,
find the sum of all the integers between and including them and return it.
If the two numbers are equal return a or b.

Note: a and b are not ordered!

Examples (a, b) --> output (explanation)
(1, 0) --> 1 (1 + 0 = 1)
(1, 2) --> 3 (1 + 2 = 3)
(0, 1) --> 1 (0 + 1 = 1)
(1, 1) --> 1 (1 since both are same)
(-1, 0) --> -1 (-1 + 0 = -1)
(-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)

https://www.codewars.com/kata/55f2b110f61eb01779000053/java
*/

public class SumOfNumbersBetween {
    
    public static void main(String[] args) {

        int a = -1;
        int b = 2;
        System.out.println(GetSum(a, b));
        
    }

    public static int GetSum(int a, int b) {

        int result = 0;
        
        if (a > b) {
            result = a;
            a = b;
            b = result;
            result = 0;
        }
        
        while (a <=b) {
            result += a;
            a++; 
        }
        return result;   
    }
}
