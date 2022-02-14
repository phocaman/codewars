/*
8 kyu
Beginner Series #4 Cockroach

https://www.codewars.com/kata/55fab1ffda3e2e44f00000c6/train/java
*/

public class BeginnerSeriesCockroach {

    public static void main(String[] args) {

        double x = 1.08;
        System.out.println(cockroachSpeed(x));
        
    }

    public static int cockroachSpeed(double x) {

        return (int) Math.floor((x * 100000) / 3600);

    }
    
}