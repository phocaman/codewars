/*
7 kyu
Isograms

An isogram is a word that has no repeating letters, consecutive or non-consecutive.
Implement a function that determines whether a string that contains only letters is an isogram.
Assume the empty string is an isogram. Ignore letter case.

Example: (Input --> Output)
"Dermatoglyphics" --> true
"aba" --> false
"moOse" --> false (ignore letter case)

https://www.codewars.com/kata/54ba84be607a92aa900000f1
*/

public class Isogram {

    public static void main(String[] args) {

        String str = "moOse";
        System.out.println(isIsogram(str));
        
    }

    public static boolean isIsogram(String str) {
        String newString = str.toUpperCase();
        for (int i = 0; i < newString.length(); i++) {
            for (int j = i + 1; j < newString.length(); j++) {
                if (newString.charAt(i) == newString.charAt(j)) {
                    return false;
                } 
            }
        }
        return true;
    }
    
}
