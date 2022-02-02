/*
8 kyu
Convert DNA to RNA

https://www.codewars.com/kata/5556282156230d0e5e000089 
*/

public class DNAToRNAConversion {

    public static void main(String[] args) {

        String dna = "TTTT";
        System.out.println(dnaToRna(dna));
        
    }

    public static String dnaToRna(String dna) {

        return dna.toUpperCase().replace("T", "U");

    }
    
}