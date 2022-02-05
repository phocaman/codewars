/*
6 kyu
Build a Pile of Cubes

https://www.codewars.com/kata/5592e3bd57b64d00f3000047
*/

public class BuildAPileOfCubes {

    public static void main(String[] args) {
        
        long m = 1871955382595582026L;
        System.out.println(findNb(m));

    }

    public static long findNb(long m) {

        long n = 0;
        long volume = 0;
        
        while (volume < m) {
            volume += n * n * n;
            n++;
        }
        
        if (volume == m) {
            return n - 1;
        } else {
            return -1;
        }
	}
    
}