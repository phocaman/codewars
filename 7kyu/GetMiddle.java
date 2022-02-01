/*
7 kyu
Get the Middle Character

https://www.codewars.com/kata/56747fd5cb988479af000028
*/


public class GetMiddle {

    public static void main(String[] args) {
        String word = "testing";
        getMiddle(word);
        
    } 

    public static String getMiddle(String word) {
        int stringLength = word.length();
        int middleIndex = stringLength / 2;
        int additionalIndex = middleIndex - 1;
        if (stringLength % 2 == 0) {
            return Character.toString(word.charAt(additionalIndex)) + Character.toString(word.charAt(middleIndex));
        } else {
            return Character.toString(word.charAt(middleIndex));
        }
    }
    
}
