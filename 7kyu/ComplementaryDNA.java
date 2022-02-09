/*
7 kyu
Complementary DNA

https://www.codewars.com/kata/554e4a2f232cdd87d9000038
*/

public class ComplementaryDNA {

    public static void main(String[] args) {

        String dna = "ATTGC";
        System.out.println(makeComplement(dna));
        
    }

    public static String makeComplement(String dna) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < dna.length(); i++) {
            if(dna.charAt(i) == 'A'){
                result.append('T');
            }
            if(dna.charAt(i) == 'T'){
                result.append('A');
            }
            if(dna.charAt(i) == 'C'){
                result.append('G');
            }
            if(dna.charAt(i) == 'G'){
                result.append('C');
            }   
        }
        return result.toString();
    }
    
}