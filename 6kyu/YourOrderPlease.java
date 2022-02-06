/*
6 kyu
Your Order, Please

https://www.codewars.com/kata/55c45be3b2079eccff00010f
*/

import java.util.Arrays;
import java.util.Comparator;

public class YourOrderPlease {

    public static void main(String[] args) {

        String words = "4of Fo1r pe6ople g3ood th5e the2";
        System.out.println(order(words));
        
    }

    public static String order(String words) {

        String[] wordsArray = words.split(" ");
        Arrays.sort(wordsArray, new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                return extractNumber(o1) - extractNumber(o2);

            }
            
            int extractNumber(String s) {
                String number = s.replaceAll("\\D", "");
                return number.isEmpty() ? 0 : Integer.parseInt(number);
            }
        });

        return String.join(" ", wordsArray);

    }
    
}