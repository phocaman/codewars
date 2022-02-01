/*
8 kyu
Basic Mathematical Operations

https://www.codewars.com/kata/57356c55867b9b7a60000bd7
*/

public class BasicOperations {

    public static void main(String[] args) {
        System.out.println(basicMath("*", 5, 5));
        
    }
    
    public static Integer basicMath(String op, int v1, int v2) {
        if ("+".equals(op)) {
            return v1 + v2;
        } else if ("-".equals(op)) {
            return v1 - v2;
        } else if ("*".equals(op)) {
            return v1 * v2;
        } else {
            if (v2 > 0) {
                return v1 / v2; 
            } else {
                System.out.println("Division by zero.");
            }
        }
    return 0;
  }

}
