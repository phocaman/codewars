/*
7 kyu
Ones and Zeros

https://www.codewars.com/kata/578553c3a1b8d5c40300037c
*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class OnesAndZeros {

    public static void main(String[] args) {
        List<Integer> binary = new ArrayList<Integer>();
        binary.add(1);
        binary.add(0);
        binary.add(1);
        binary.add(1);
        System.out.println(ConvertBinaryArrayToInt(binary));        
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {

        String binaryString = binary.stream().map(String::valueOf).collect(Collectors.joining(""));
        int result = 0;
        for (char c : binaryString.toCharArray()) {
            result <<= 1;
            result += c-'0';
        }
        return result;
    }
    
}
