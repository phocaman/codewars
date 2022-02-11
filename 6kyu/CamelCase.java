/*
6 kyu
Break Camel Case

https://www.codewars.com/kata/5208f99aee097e6552000148
*/

public class CamelCase {

    public static void main(String[] args) {

        String input = "camelCase";
        System.out.println(camelCase(input));
        
    }

    public static String camelCase(String input) {

        return input.replaceAll("([^_])([A-Z])", "$1 $2");
   
    }
    
}