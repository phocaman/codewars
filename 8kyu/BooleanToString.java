/*
8 kyu
Boolean To String

https://www.codewars.com/kata/551b4501ac0447318f0009cd
*/

public class BooleanToString {

    public static void main(String[] args) {
        Boolean b1 = true;
        Boolean b2 = false;
        System.out.println(convert(b1));
        System.out.println(convert(b2));
    }

    public static String convert(boolean b){
        return String.valueOf(b);
    }
    
}