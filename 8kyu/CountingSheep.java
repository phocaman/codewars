/*
8 kyu
Counting Sheep

https://www.codewars.com/kata/54edbc7200b811e956000556
*/

public class CountingSheep {

    public static void main(String[] args) {

        Boolean[] arrayOfSheeps = {true, false, true, null, true, false, true};
        System.out.println(countSheeps(arrayOfSheeps));
        
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {

        int sheepCounter = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null && arrayOfSheeps[i] != false) {
                sheepCounter += 1;
            } 
        }
        return sheepCounter;
    }
}
