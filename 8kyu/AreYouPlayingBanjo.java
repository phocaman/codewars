/*
8 kyu
Are You Playing Banjo?

https://www.codewars.com/kata/53af2b8861023f1d88000832
*/

public class AreYouPlayingBanjo {

    public static void main(String[] args) {
        
        String name = "Robert";
        System.out.println(areYouPlayingBanjo(name));
    }

    public static String areYouPlayingBanjo(String name) {

        if (name.toUpperCase().startsWith("R")) {
            return name + " plays banjo";
        }
        return name + " does not play banjo";
    }
    
}