/*
4 kyu
Permutations

https://www.codewars.com/kata/5254ca2719453dcc0b00027d
*/

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/**
 * StringPermutations
 */
public class StringPermutations {

    public static void main(String[] args) {

        String s = "aabb";
        System.out.println(singlePermutations(s));
        
    }

    public static List<String> singlePermutations(String s) {
        
        Queue<String> permutations = new LinkedList<String>();
        Set<String> result = new HashSet<String>();
        permutations.add(s);

        while (!permutations.isEmpty()) {
            String str = permutations.poll();
            if (!result.contains(str)) {
                result.add(str);
                for (int i = 0; i < str.length(); i++) {
                    String c = String.valueOf(str.charAt(i));
                    permutations.add(str.substring(i + 1) + c + str.substring(0, i));
                }
            }
        }
        return new ArrayList<>(result);
    }
}