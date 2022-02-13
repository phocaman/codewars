/*
5 kyu
Simple Pig Latin

https://www.codewars.com/kata/520b9d2ad5c005041100000f/java
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimplePigLatin {

    public static void main(String[] args) {

        String str = "Pig Latin is really cool !";
        System.out.println(pigIt(str));
        
    }

    public static String pigIt(String str) {

        String[] words = str.split(" ");
        String[] pigLatinizedWords = new String[words.length];

        for (int i = 0; i < words.length; i++) {
            if (".".equals(words[i])
                || ",".equals(words[i])
                || "!".equals(words[i])
                || "?".equals(words[i])
                || ";".equals(words[i])
                || ":".equals(words[i])
                || "-".equals(words[i])) {
                pigLatinizedWords[i] = words[i];
            } else {
                pigLatinizedWords[i] = pigLatinizer(words[i]);
            }
        }
        return String.join(" ", pigLatinizedWords);

    }

    public static String pigLatinizer(String str) {
        
        Pattern firstLetterPattern = Pattern.compile("^([a-zA-Z])");
        Matcher matcher = firstLetterPattern.matcher(str);
        
        if (matcher.find()) return str.substring(1) + str.substring(0, 1) + "ay";
        
        return str.replaceAll("^([^a-zA-Z]*)(.+)", "$2$1ay");

    }
    
}