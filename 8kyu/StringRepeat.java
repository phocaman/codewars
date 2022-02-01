/*
8 kyu
String Repeat

https://www.codewars.com/kata/57a0e5c372292dd76d000d7e
*/

public class StringRepeat {

    public static void main(String[] args) {

        int repeat = 5;
        String string = "Hello";
        System.out.println(repeatStr(repeat, string));
        
    }

    public static String repeatStr(final int repeat, final String string) {
        
        return new String(new char[repeat]).replace("\0", string);
      
    }
    
}
