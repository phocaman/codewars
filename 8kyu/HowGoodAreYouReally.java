/*
8 kyu
How Good Are You Really?

https://www.codewars.com/kata/5601409514fc93442500010b
*/

public class HowGoodAreYouReally {

    public static void main(String[] args) {

        int[] classPoints = {100, 90};
        int yourPoints = 11;
        System.out.println(betterThanAverage(classPoints, yourPoints));
        
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
    
        int sumPoints = 0;
        
        for (int i = 0; i < classPoints.length; i++) {
            sumPoints += classPoints[i];
        }

        double avgPoints = sumPoints / classPoints.length;

        if (yourPoints > avgPoints) {
            return true;
        }
        return false;

    }
    
}