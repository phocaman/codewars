/*
5 kyu
Directions Reduction

https://www.codewars.com/kata/550f22f4d758534c1100025a
*/

import java.util.Arrays;

public class DirectionsReduction {

    public static void main(String[] args) {

        String[] arr = {"NORTH","SOUTH","SOUTH","EAST","WEST","NORTH"};
        System.out.println(Arrays.toString(dirReduc(arr)));
        
    }

    public static String[] dirReduc(String[] arr) {

        String result = "";

        for (int i = 0; i < arr.length; i++) {
            result = result + "," + arr[i];
            result = result.replace(",EAST,WEST", "").replace(",WEST,EAST", "")
                            .replace(",SOUTH,NORTH", "").replace(",NORTH,SOUTH", "");

        }
        return result.length() == 0 ? new String[] {} : result.substring(1).split(",");

    }
    
}
