/*
8 kyu
Century From Year

https://www.codewars.com/kata/5a3fe3dde1ce0e8ed6000097
*/

public class CenturyFromYear {

	public static void main(String[] args) {

		int number = 785;
		System.out.println(century(number));

	}
	
	public static int century(int number) {
		
		return (number + 99) / 100;
	
	}

}
