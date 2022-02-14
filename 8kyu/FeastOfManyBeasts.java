/*
8 kyu
The Feast of Many Beasts

https://www.codewars.com/kata/5aa736a455f906981800360d
*/

import java.util.Objects;

public class FeastOfManyBeasts {

    public static void main(String[] args) {
        String beast = "chickadee";
        String dish = "chocolate cake";
        System.out.println(feast(beast, dish));
        
    }

    public static boolean feast(String beast, String dish) {

        String[] beastSplit = beast.split("");
        String[] dishSplit = dish.split("");

        if (Objects.equals(beastSplit[0], dishSplit[0])
            && Objects.equals(beastSplit[beastSplit.length-1], dishSplit[dishSplit.length-1])) {
            return true;
        }
    
        return false;
        
    }
    
}