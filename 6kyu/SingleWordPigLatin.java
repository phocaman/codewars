/*
6 kyu
Single Word Pig Latin

https://www.codewars.com/kata/558878ab7591c911a4000007/java
*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SingleWordPigLatin {

    public static void main(String[] args) {

        String str = "abracadabra";
        System.out.println(translate(str));
        
    }

    public static String translate(String str){

        Pattern firstLetterPattern = Pattern.compile("^([aeiouAEIOU])");
        Matcher matcher = firstLetterPattern.matcher(str);
        
        if (str.matches(".*\\d.*")) {
            return null;
        }

        if (matcher.find()) return str.toLowerCase() + "way";
        
        return str.toLowerCase().replaceAll("^([^aeiouAEIOU]*)(.+)", "$2$1ay");

    }
    
}
