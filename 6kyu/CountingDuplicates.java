/*
6 kyu
Counting Duplicates

Count the number of Duplicates
Write a function that will return the count of distinct case-insensitive
alphabetic characters and numeric digits that occur more than once in the input string.
The input string can be assumed to contain only alphabets (both uppercase and lowercase)
and numeric digits.

Example
"abcde" -> 0 # no characters repeats more than once
"aabbcde" -> 2 # 'a' and 'b'
"aabBcde" -> 2 # 'a' occurs twice and 'b' twice (`b` and `B`)
"indivisibility" -> 1 # 'i' occurs six times
"Indivisibilities" -> 2 # 'i' occurs seven times and 's' occurs twice
"aA11" -> 2 # 'a' and '1'
"ABBA" -> 2 # 'A' and 'B' each occur twice

https://www.codewars.com/kata/54bf1c2cd5b56cc47f0007a1
*/

import java.util.HashMap;
import java.util.Map;

public class CountingDuplicates {

    public static void main(String[] args) {

        String text = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZReturnsTwentySix";
        System.out.println(duplicateCount(text));
        
    }

    public static int duplicateCount(String text) {
        
        String[] strArray = text.toUpperCase().split("");
        
        Map<String,Integer> dupMap = new HashMap<String,Integer>();
        
        for (String str : strArray) {
            if (dupMap.containsKey(str)) {
                dupMap.put(str, dupMap.get(str) + 1);
            } else {
                dupMap.put(str, 1);
            }
        }

        int duplicates = 0;
        for (int item : dupMap.values()) {
            if (item > 1) {
                duplicates++;
            } 
        }
        return duplicates;  
    }
}