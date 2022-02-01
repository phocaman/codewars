/*
8 kyu
Convert boolean values to strings 'Yes' or 'No'

https://www.codewars.com/kata/53369039d7ab3ac506000467
*/

public class YesOrNo {
    
    public static void main(String[] args) {
        boolean b = false;
        System.out.println(boolToWord(b));
        
    }

    public static String boolToWord(boolean b) {

        if (b == true) {
            return "Yes";
        } else {
            return "No";
        }

    }

}
