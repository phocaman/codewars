/*
8 kyu
Thinkful - Logic Drills: Traffic light

https://www.codewars.com/kata/58649884a1659ed6cb000072
*/

public class TrafficLights {

    public static void main(String[] args) {

        String current = "green";
        System.out.println(updateLight(current));
        
    }

    public static String updateLight(String current) {
        
        switch (current) {
            case "green":
            return "yellow";
            case "yellow":
            return "red";
            case "red":
            return "green";
            default:
            return "green";
        }

    }
    
}