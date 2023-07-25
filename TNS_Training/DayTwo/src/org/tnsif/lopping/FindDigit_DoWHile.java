package org.tnsif.lopping;

public class FindDigit_DoWHile {

	public static void main(String[] args) {
		int number=1;
	
		do {
			int digit=number%10;
			System.out.println(digit);
			number=number/10;
		}while(number>0);

	}

}
