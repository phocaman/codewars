/*
7 kyu
Shortest Word

Simple, given a string of words, return the length of the shortest word(s).

String will never be empty and you do not need to account for different data types.

https://www.codewars.com/kata/57cebe1dc6fdc20c57000ac9
*/

public class ShortestWord {

    public static void main(String[] args) {

        String s = "turns out random test cases are easier than writing out basic ones";
        System.out.println(findShort(s));
        
    }

    public static int findShort(String s) {

        String[] words = s.split(" ");
        String shortest = words[0];
        for (int i = 1; i < words.length; i++) {
            if (words[i].length() < shortest.length()) {
                shortest = words[i];
            }
        }   
        return shortest.length();
    }
        
}