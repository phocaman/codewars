/*
7 kyu
Disemvowel Trolls

https://www.codewars.com/kata/52fba66badcd10859f00097e
*/


public class DisemvowelTrolls {

    public static void main(String[] args) {

        String str = "Hello World";
        System.out.println(disemvowel(str));
        
    }

    public static String disemvowel(String str) {

        return str.replaceAll("[AEIOUaeiou]", "");
    
    }
    
}