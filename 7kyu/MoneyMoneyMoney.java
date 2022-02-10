/*
7 kyu
Money, Money, Money

https://www.codewars.com/kata/563f037412e5ada593000114
*/

public class MoneyMoneyMoney {

    public static void main(String[] args) {

        double principal = 1000;
        double interest = 0.01625;
        double tax = 0.18;
        double desired = 1200;
        System.out.println(calculateYears(principal, interest, tax, desired));
        
    }

    public static int calculateYears(double principal, double interest, double tax, double desired) {
    
        if (desired == principal) {
            return 0;
        }

        int years = 0;

        while (principal < desired) {
            principal += (principal * interest) * (1 - tax);
            years++;
        }
        return years;

    } 
        
}