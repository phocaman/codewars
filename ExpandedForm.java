/*
6 kyu
Write a Number in Expanded Form

https://www.codewars.com/kata/5842df8ccbd22792a4000245/java
*/

public class ExpandedForm {

    public static void main(String[] args) {

        int num = 123456789;
        System.out.println(expandedForm(num));
        
    }

    public static String expandedForm(int num) {

        String output = "";
        
        for (int i = 10; i < num; i *= 10) {
            int remainder = num % i;
            output = (remainder > 0) ? " + " + remainder + output : output;
            num -= remainder;
        }
        output = num + output;

        return output;

    }
    
}