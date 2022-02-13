/*
8 kyu
Parse nice int from char problem

https://www.codewars.com/kata/557cd6882bfa3c8a9f0000c1
*/

/**
 * ParseInt
 */
public class ParseInt {

    public static void main(String[] args) {

        String herOld = "5 years old";
        System.out.println(howOld(herOld));
        
    }

    public static int howOld(String herOld) {

        return Integer.parseInt(herOld.replaceAll("\\D+",""));
        
    }

}