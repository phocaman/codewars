/*
6 kyu
Count the Smiley Faces!

Given an array (arr) as an argument complete the function counterSmileys
that should return the total number of smiling faces.

Rules for a smiling face:

Each smiley face must contain a valid pair of eyes. Eyes can be marked as : or ;
A smiley face can have a nose but it does not have to. Valid characters for a nose are - or ~
Every smiling face must have a smiling mouth that should be marked with either ) or D
No additional characters are allowed eicept for those mentioned.

Valid smiley face eiamples: :) :D ;-D :~)
Invalid smiley faces: ;( :> :} :]

Example
counterSmileys([':)', ';(', ';}', ':-D']);       // should return 2;
counterSmileys([';D', ':-(', ':-)', ';~)']);     // should return 3;
counterSmileys([';]', ':[', ';*', ':$', ';-D']); // should return 1;
Note
In case of an empty array return 0. You will not be tested with invalid input
(input will always be an array). Order of the face (eyes, nose, mouth) elements
will always be the same.

https://www.codewars.com/kata/583203e6eb35d7980400002a
*/

import java.util.ArrayList;
import java.util.List;

public class CountTheSmileyFaces {

    public static void main(String[] args) {

        List<String> arr = new ArrayList<String>();
        arr.add(":2)");
        arr.add("8-x");
        arr.add(";~2D");
        arr.add("o;D");
        arr.add(":)");
        arr.add(";-D");
        arr.add("(~)");
        arr.add(";d");
        arr.add("5D");
        arr.add(";pDD");
        arr.add(":P");
        arr.add("o)");
        arr.add("~D");
        arr.add(";~)");
        arr.add("p-X");
        arr.add(":)");
        arr.add(":~d");
        arr.add(":xd");
        arr.add("4dp");
        arr.add(";~xD");
        arr.add("5-)");
        arr.add("4)");
        arr.add(":X");
        arr.add("'~X");
        System.out.println(countSmileys(arr));
        
    }

    public static int countSmileys(List<String> arr) {

        return (int) arr.stream().filter(element -> element.matches("[:;][-~]?[)D]")).count();

    }
}
