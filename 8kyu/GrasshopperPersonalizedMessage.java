/*
8 kyu
Grasshopper - Personalized Message

https://www.codewars.com/kata/5772da22b89313a4d50012f7
*/

import java.util.Objects;

public class GrasshopperPersonalizedMessage {

    public static void main(String[] args) {

        String name = "Ewa";
        String owner = "Daniel";
        System.out.println(greet(name, owner));
        
    }

    static String greet(String name, String owner) {

        return Objects.equals(name, owner) ? "Hello boss" : "Hello guest"; 
        
    }
    
}