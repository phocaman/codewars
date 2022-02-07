/*
7 kyu
Sum of the First Nth Term of Series

https://www.codewars.com/kata/555eded1ad94b00403000071
*/

import java.text.DecimalFormat;

public class SumOfTheFirstNthTermOfSeries {

    public static void main(String[] args) {

        int n = 2;
        System.out.println(seriesSum(n));
        
    }

    public static String seriesSum(int n) {

        DecimalFormat df = new DecimalFormat("####0.00");

        if (n == 0 || n == 1) {
            return df.format(n);
        }

        double sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Double.valueOf(1) / Double.valueOf(1 + i * 3);
        }
        return df.format(sum);
        
    }
    
}