/*
4 kyu
Roman Numerals Helper

https://www.codewars.com/kata/51b66044bce5799a7f000003
*/

import java.util.HashMap;

public class FromRomanNumerals {

    public static void main(String[] args) {

        String romanNumeral = "MMXXII";
        System.out.println(fromRoman(romanNumeral));
        
    }

    public static int fromRoman(String romanNumeral) {

    HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
    
    hm.put('I', 1);
    hm.put('X', 10);
    hm.put('C', 100);
    hm.put('M', 1000);
    hm.put('V', 5);
    hm.put('L', 50);
    hm.put('D', 500);

    int result = 0;
    int previous = 0;
    
    for (int i = romanNumeral.length() - 1; i >= 0; i--) {
            int temp = hm.get(romanNumeral.charAt(i));
            if (temp < previous) {
                result -= temp;
            } else {
                result += temp;
            }
            previous = temp;
        }
        return result;
    
    }

}