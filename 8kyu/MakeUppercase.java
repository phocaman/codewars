/*
8 kyu
Make Uppercase

https://www.codewars.com/kata/57a0556c7cb1f31ab3000ad7
*/

public class MakeUppercase {

    public static void main(String[] args) {
        String str = "This is a test";
        System.out.println(MakeUpperCase(str));
    }

    public static String MakeUpperCase(String str){
        return str.toUpperCase();
    }
    
}