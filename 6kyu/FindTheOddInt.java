/*
6 kyu
Find the Odd Int

https://www.codewars.com/kata/54da5a58ea159efa38000836
*/

public class FindTheOddInt {

    public static void main(String[] args) {

        int[] a = {20, 1, -1, 2, -2, 3, 3, 5, 5, 1, 2, 4, 20, 4, -1, -2, 5};
        System.out.println(findIt(a));
        
    }

    public static int findIt(int[] a) {

        for (int i = 0; i < a.length; i++) {
            int counter = 0;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j]) {
                    counter++;
                }
            }
            if (counter % 2 != 0) {
                return a[i];
            }
        } 
        return -1;
    }
    
}