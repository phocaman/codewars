/*
7 kyu
Find the Next Perfect Square

https://www.codewars.com/kata/56269eb78ad2e4ced1000013
*/

public class NextPerfectSquare {

    public static void main(String[] args) {
        
        long sq = 624;
        System.out.println(findNextSquare(sq));

    }

    public static long findNextSquare(long sq) {
        long nextSquare = (long) (Math.floor(Math.sqrt(sq)) + 1);
        if (Math.sqrt(sq) % 1 == 0) {
            return nextSquare * nextSquare;
        } else {
            return -1;
        }
    }
}