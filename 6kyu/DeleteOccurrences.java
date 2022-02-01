/*
6 kyu
Delete occurrences of an element if it occurs more than n times

Given a list lst and a number N, create a new list that contains each number of lst
at most N times without reordering. For example if N = 2, and the input is [1,2,3,1,2,1,2,3],
you take [1,2,3,1,2], drop the next [1,2] since this would lead to 1 and 2
being in the result 3 times, and then take 3, which leads to [1,2,3,1,2,3].

Example
EnoughIsEnough.deleteNth(new int[] {20,37,20,21}, 1) // return [20,37,21]
EnoughIsEnough.deleteNth(new int[] {1,1,3,3,7,2,2,2,2}, 3) // return [1, 1, 3, 3, 7, 2, 2, 2]

https://www.codewars.com/kata/554ca54ffa7d91b236000023
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class DeleteOccurrences {

    public static void main(String[] args) {

        int[] elements = {1, 1, 3, 3, 7, 2, 2, 2, 2};
        int maxOccurrences = 3;
        System.out.println(Arrays.toString(deleteNth(elements, maxOccurrences)));
        
    }

    public static int[] deleteNth(int[] elements, int maxOccurrences) {
		
        if (elements.length == 0) {
            return new int[]{};
        }
        
        HashMap<Integer, Integer> occurence = new HashMap<>();
        List<Integer> result = new ArrayList<>();

        for (int element : elements) {
            occurence.put(element, 0);
        }
        
        for (int element : elements) {
            if (occurence.get(element) < maxOccurrences) {
                occurence.put(element, occurence.get(element) + 1);
                result.add(element);
            }

        }
        
        int[] output = new int[result.size()];
        
        for (int i = 0; i < result.size(); i++) {
            output[i] = result.get(i);
        }
        return output;

    }

}