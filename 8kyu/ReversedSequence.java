/*
8 kyu
Reversed Sequence

https://www.codewars.com/kata/5a00e05cc374cb34d100000d
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversedSequence {

    public static void main(String[] args) {

        int n = 20;
        System.out.println(Arrays.toString(reverse(n)));
        
    }

    public static int[] reverse(int n){
        
        List<Integer> reversed = new ArrayList<>();
        
        for (int i = n; i > 0; i--) {
            reversed.add(i);
        }
        return reversed.stream().mapToInt(i -> i).toArray();

    }
    
}