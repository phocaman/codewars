/*
8 kyu
Correct the mistakes of the character recognition software

https://www.codewars.com/kata/577bd026df78c19bca0002c0
*/

public class CorrectTheMistakes {

    public static void main(String[] args) {
        
        String string = "501";
        System.out.println(correct(string));

    }

    public static String correct(String string) {
        
        return string.replace("5", "S").replace("0", "O").replace("1", "I");
    
    }
    
}