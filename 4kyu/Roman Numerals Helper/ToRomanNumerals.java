/*
4 kyu
Roman Numerals Helper

https://www.codewars.com/kata/51b66044bce5799a7f000003
*/

public class ToRomanNumerals {

    public static void main(String[] args) {

        int n = 2022;
        System.out.println(toRoman(n));
        
    }

    public static String toRoman(int n) {
        
        return "I".repeat(n)
            .replace("IIIII", "V")
            .replace("IIII", "IV")
            .replace("VV", "X")
            .replace("VIV", "IX")
            .replace("XXXXX", "L")
            .replace("XXXX", "XL")
            .replace("LL", "C")
            .replace("LXL", "XC")
            .replace("CCCCC", "D")
            .replace("CCCC", "CD")
            .replace("DD", "M")
            .replace("DCD", "CM");
            
    }
    
}