/*
7 kyu
Reverse Words

Complete the function that accepts a string parameter,
and reverses each word in the string. All spaces in the string should be retained.

Examples
"This is an example!" ==> "sihT si na !elpmaxe"
"double  spaces"      ==> "elbuod  secaps"

https://www.codewars.com/kata/5259b20d6021e9e14c0010d4
*/

import java.io.*;

public class ReverseWords {

    public static void main(String[] args) {
        
        String original = "  ";
        System.out.println(reverseWords(original));
    
    }

    public static String reverseWords(final String original) {

        if (original.trim().isEmpty()) {
            return original;
          }
    
        StringBuilder output = new StringBuilder();

        try {
            String line = null;
            BufferedReader reader = new BufferedReader(new StringReader(original));
            while ((line = reader.readLine()) != null){
                String[] words = line.split(" ");
                output.append(reverseChars(words[0]));
                for(int i = 1; i < words.length; i++){
                    String reversed = reverseChars(words[i]);
                    output.append(" ").append(reversed);
                }
            }
            return output.toString();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return original;
    }

    public static String reverseChars(String word){
        StringBuilder builder = new StringBuilder();
        for(int i = word.length() - 1; i >= 0; i--){
            builder.append(word.charAt(i));
        }
        return builder.toString();
    }
    
}