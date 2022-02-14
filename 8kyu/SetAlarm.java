/*
8 kyu
L1: Set Alarm

https://www.codewars.com/kata/568dcc3c7f12767a62000038
*/

public class SetAlarm {

    public static void main(String[] args) {

        boolean employed = true;
        boolean vacation = false;
        System.out.println(setAlarm(employed, vacation));
        
    }

    public static boolean setAlarm(boolean employed, boolean vacation) {

        if (employed && !vacation) {
            return true;
        }
        return false;

    }
    
}