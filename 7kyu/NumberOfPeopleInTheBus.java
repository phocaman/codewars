/*
7 kyu
Number of People in the Bus

https://www.codewars.com/kata/5648b12ce68d9daa6b000099
*/

import java.util.ArrayList;

/**
 * NumberOfPeopleInTheBus
 */
public class NumberOfPeopleInTheBus {

    public static void main(String[] args) {

        ArrayList<int[]> stops = new ArrayList<int[]>();
        stops.add(new int[] {10, 0});
        stops.add(new int[] {3, 5});
        stops.add(new int[] {2, 5});
        System.out.println(countPassengers(stops));
        
    }

    public static int countPassengers(ArrayList<int[]> stops) {

        int result = 0;

        for (int[] stop : stops) {
            result += (stop[0] - stop[1]);
        }
        return result;

    }

}

