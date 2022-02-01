/*
6 kyu
Take a Ten Minute Walk

https://www.codewars.com/kata/54da539698b8a2ad76000228
*/

public class TenMinWalk {

    public static void main(String[] args) {
        char[] walk = {'w','e','w','e','w','e','w','e','w','e','w','e'};
        System.out.println(isValid(walk));
        
    }

    public static boolean isValid(char[] walk) {
    
        if (walk.length != 10) {
            return false;
        }

        int northSouth = 0;
        int eastWest = 0;

        for (int i = 0; i < 10; i++) {
            switch (walk[i]) {
                case 'n':
                northSouth++;
                break;
                case 's':
                northSouth--;
                break;
                case 'w':
                eastWest--;
                break;
                case 'e':
                eastWest++;
                break;
                default:
                System.out.println("Invalid Direction");

            }
        }
        return northSouth == 0 && eastWest == 0;
    }
    
}
