/*
7 kyu
Is This a Triangle?

https://www.codewars.com/kata/56606694ec01347ce800001b
*/

public class IsTriangle {

    public static void main(String[] args) {

        int a = 8;
        int b = 3;
        int c = 4;
        System.out.println(isTriangle(a, b, c));
        
    }

    public static boolean isTriangle(int a, int b, int c){
        
        boolean condition = a < b + c && b < c + a && c < b + a;
        if (condition) {
            return true;
        }
        return false;
    
    }
    
}