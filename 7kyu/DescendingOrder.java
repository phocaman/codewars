/*
7 kyu
Descending Order

https://www.codewars.com/kata/5467e4d82edf8bbf40000155
*/

public class DescendingOrder {

	public static void main(String[] args) {
		int num = 123456789;
		System.out.println(sortDesc(num));
		
	}
	
	public static int sortDesc(final int num) {

		if (num < 0) {
			return num;
	    }  
	    int result = 0;
	    for (int i = 9; i >= 0; i--) {
	        int temp = num;
	        while (temp > 0) {
	            int digit = temp % 10;
	            if (digit == i) {
	                result *= 10;
	                result += digit;
	            }
	            temp /= 10;
	        }
	    }
	    return result;
	}
}
