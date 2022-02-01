/*
8 kyu
Convert a String to a Number

Description
We need a function that can transform a string into a number.
What ways of achieving this do you know?

Note: Don't worry, all inputs will be strings, and every string is
a perfectly valid representation of an integral number.

Examples
"1234" --> 1234
"605"  --> 605
"1405" --> 1405
"-7" --> -7

https://www.codewars.com/kata/544675c6f971f7399a000e79
*/

public class StringToNumber {

    public static void main(String[] args) {

        String str = "1234567890";
        System.out.println(stringToNumber(str));
        
    }

    public static int stringToNumber(String str) {

        return Integer.parseInt(str);

    }
    
}