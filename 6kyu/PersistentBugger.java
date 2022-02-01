/*
6 kyu
Persistent Bugger

https://www.codewars.com/kata/55bf01e5a717a0d57e0000ec
*/

public class PersistentBugger {

    public static void main(String[] args) {
        long n = 999;
        System.out.println(persistence(n));
    }

    public static int persistence(long n) {

        int counter = 0;
        int m;
        while (n > 9) {
            m = 1;
            while (n > 0) {
                m *= n % 10;
                n /= 10;
            }
            n = m;
            counter++;
        }
        return counter;
    }
    
}
