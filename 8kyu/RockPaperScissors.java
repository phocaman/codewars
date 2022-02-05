/*
8 kyu
Rock Paper Scissors!

https://www.codewars.com/kata/5672a98bdbdd995fad00000f
*/

public class RockPaperScissors {

    public static void main(String[] args) {

        String p1 = "paper";
        String p2 = "scissors";
        System.out.println(rps(p1, p2));
        
    }

    public static String rps(String p1, String p2) {

        if ("scissors".equals(p1) && "paper".equals(p2)
            || "paper".equals(p1) && "rock".equals(p2)
            || "rock".equals(p1) && "scissors".equals(p2)) {
                return "Player 1 won!";
        } else if ("scissors".equals(p2) && "paper".equals(p1)
            || "paper".equals(p2) && "rock".equals(p1)
            || "rock".equals(p2) && "scissors".equals(p1)) {
                return "Player 2 won!";
        }
        return "Draw!";
    }
    
}