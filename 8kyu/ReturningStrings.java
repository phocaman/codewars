
/**
 8 kyu
 Returning Strings

 https://www.codewars.com/kata/55a70521798b14d4750000a4
 */

 public class ReturningStrings {

    public static void main(String[] args) {
        System.out.println(greet("Ryan"));
    }

    public static String greet(String name) {
        return "Hello, " + name + " how are you doing today?";
    }
}