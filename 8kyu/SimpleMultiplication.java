/*
8 kyu
Simple Multiplication

https://www.codewars.com/kata/583710ccaa6717322c000105/train/java
*/

public class SimpleMultiplication {

    public static void main(String[] args) {
        int n = 7;
        System.out.println(simpleMultiplication(n));
    }

    public static int simpleMultiplication(int n) {
        if (n % 2 == 0) {
          return n * 8;
        }
        return n * 9;
    }
    
}