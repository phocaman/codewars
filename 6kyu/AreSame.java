/*
6 kyu
Are They the "Same"?

https://www.codewars.com/kata/550498447451fbbd7600041c
*/

import java.util.Arrays;

public class AreSame {

    public static void main(String[] args) {

        int[] a = {121, 144, 19, 161, 19, 144, 19, 11};
        int[] b = {121, 14641, 20736, 361, 25921, 361, 20736, 361};
        System.out.println(comp(a, b));
        
    }

    public static Boolean comp(int[] a, int[] b) {

        if (a == null || b == null) {
            return false;
        }

        if (a.length != b.length) {
            return false;
        }

        int[] sortA = Arrays.stream(a).map(Math::abs).sorted().toArray();
        int[] sortB = Arrays.stream(b).sorted().toArray();

        for (int i = 0; i < a.length; i++) {
            if (sortA[i] * sortA[i] != sortB[i]) {
              return false;
            }

        }
        return true;
    }
}
