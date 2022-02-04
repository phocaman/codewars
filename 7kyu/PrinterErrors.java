/*
7 kyu
Printer Errors

https://www.codewars.com/kata/56541980fa08ab47a0000040
*/

public class PrinterErrors {

    public static void main(String[] args) {

        String s = "aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz";
        System.out.println(printerError(s));
        
    }

    public static String printerError(String s) {
        
        int err = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) > 'm') {
                err++;
            }
        }
        return Integer.toString(err) + "/" + Integer.toString(s.length());

    }
    
}