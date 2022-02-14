/*
5 kyu
Diophantine Equation

https://www.codewars.com/kata/554f76dca89983cc400000bb/java
*/

import java.util.ArrayList;
import java.util.List;

public class DiophantineEquation {

    public static void main(String[] args) {

        long n = 5;
        System.out.println(solEquaStr(n));
        
    }

    public static String solEquaStr(long n) {

        List<ArrayList<String>> result = new ArrayList<>();

        for (long i = 1; i <= Math.sqrt(n); i++) {
            
            if (n % i != 0) {
                continue;
            }
            
            long j = n / i;
            long y = (j - i) / 4;
            long x = i + 2 * y;
            
            if (x >= 0 && y >= 0 && j == x + 2 * y && i == x - 2 * y) {
                result.add(new ArrayList<String>() {{ add(x + ", " + y); }});
            }
            
        }
        return result.toString();
        
    }
    
}