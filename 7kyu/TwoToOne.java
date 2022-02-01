/*
7 kyu
Two to One

https://www.codewars.com/kata/5656b6906de340bd1b0000ac
*/

import java.util.*;

public class TwoToOne {

    public static void main(String[] args) {

        String s1 = "aretheyhere";
        String s2 = "yestheyarehere";
        System.out.println(longest(s1, s2));
        
    }

    public static String longest (String s1, String s2) {
        
        String newString = s1 + s2;
        List<String> stringToList = new ArrayList<String>(Arrays.asList(newString.split("")));
        Collections.sort(stringToList);
        Set<String> finalString = new LinkedHashSet<>(stringToList);

    return String.join("", finalString);

    }
    
}