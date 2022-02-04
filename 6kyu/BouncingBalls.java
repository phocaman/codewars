/*
6 kyu
Bouncing Balls

https://www.codewars.com/kata/5544c7a5cb454edb3c000047
*/

public class BouncingBalls {

    public static void main(String[] args) {

        double h = 30;
        double bounce = 0.66;
        double window = 1.5;
        System.out.println(bouncingBall(h, bounce, window));
        
    }

    public static int bouncingBall(double h, double bounce, double window) {

        boolean condition = h > 0 && (1 > bounce && bounce > 0) && h > window;

        if (condition) {
            if (h < window) {
                return -1;
            } else {
                return 2 + bouncingBall((h * bounce), bounce, window);
            }
        }
        return -1;
	}
    
}