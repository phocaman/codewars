/*
8 kyu
You Only Need One - Beginner

You will be given an array a and a value x.
All you need to do is check whether the provided array contains the value.

Array can contain numbers or strings. X can be either.

Return true if the array contains the value, false if not.

https://www.codewars.com/kata/57cc975ed542d3148f00015b
*/

import java.util.Arrays;

public class OnlyOneIsNeeded {

    public static void main(String[] args) {
        Object[] a = {80, 117, 115, 104, 45, 85, 112, 115};
        Object x = 45;
        System.out.println(check(a, x));
    }

    public static boolean check(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }
    
}
