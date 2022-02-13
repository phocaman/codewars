/*
8 kyu
Sentence Smash

https://www.codewars.com/kata/53dc23c68a0c93699800041d
*/

public class SentenceSmash {

    public static void main(String[] args) {

        String[] words = {"hello", "world", "this", "is", "great"};
        System.out.println(smash(words));
        
    }

    public static String smash(String[] words) {
        
        return String.join(" ", words);

    }
    
}