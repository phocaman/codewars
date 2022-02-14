/*
7 kyu
Jaden Casing Strings

https://www.codewars.com/kata/5390bac347d09b7da40006f6
*/

public class JadenCasingStrings {

    public static void main(String[] args) {

        String phrase = "most trees are blue";
        System.out.println(toJadenCase(phrase));
        
    }

    public static String toJadenCase(String phrase) {

        if (phrase == null || "".equals(phrase)) {
            return null;
        }
		
        StringBuilder builder = new StringBuilder(phrase);
        
        for (int i = 0; i < builder.length(); i++) {
            if (i == 0 || builder.charAt(i - 1) == ' ') {
                builder.setCharAt(i, Character.toUpperCase(builder.charAt(i)));
            }
        }
        return builder.toString();

	}
    
}