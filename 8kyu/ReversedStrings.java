/*
8 kyu
Reversed Strings

https://www.codewars.com/kata/5168bb5dfe9a00b126000018
*/

public class ReversedStrings {

    public static void main(String[] args) {

        String str = "Jabberwocky";
        System.out.println(solution(str));
        
    }

    public static String solution(String str) {
    
        StringBuilder builder = new StringBuilder(str);
        builder.reverse();
        
        return builder.toString();
    
    }

}
