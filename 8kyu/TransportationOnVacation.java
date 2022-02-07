/*
8 kyu
Transportation on Vacation

https://www.codewars.com/kata/568d0dd208ee69389d000016
*/

public class TransportationOnVacation {

    public static void main(String[] args) {

        int d = 10;
        System.out.println(rentalCarCost(d));
        
    }

    public static int rentalCarCost(int d) {

        int rent = 40;

        if (d >= 3 && d < 7) {
            return (d * rent) - 20;
        } else if (d >= 7) {
            return (d * rent) - 50;
        }
        return d * rent;
    
    }
    
}