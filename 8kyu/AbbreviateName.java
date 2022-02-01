/*
8 kyu
Abbreviate a Two Word Name

https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3
*/

public class AbbreviateName {

    public static void main(String[] args) {

        String name = "Linus Torvalds";
        System.out.println(abbrevName(name));
        
    }

    public static String abbrevName(String name) {
    
        return name.replaceAll("([^\\s])[^\\s]+", "$1").replaceAll("\\s", ".").toUpperCase();
    
    }
    
}
