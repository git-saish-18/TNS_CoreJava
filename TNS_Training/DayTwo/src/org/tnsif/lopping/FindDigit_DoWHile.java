package org.tnsif.lopping;

public class FindDigit_DoWHile {

	public static void main(String[] args) {
		int number=0;
		int cnt=0;
		do {
			int digit=number%10;
			cnt++;
			number=number/10;
		}while(number>0);
		System.out.println(cnt);
	}

}
