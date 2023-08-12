package org.tnsif.abstractkeyword;

public class CheseCornSandwich extends Sandwich {
	
	@Override
	void prepare() {
		System.out.print(" TODO Auto-generated method stub");
		
	}
	@Override
	void prepare(int num) {
		System.out.print("\n TODO Auto-generated method stub "+num);
		
	}
	
	public static void main(String[] args) {
		
		// we cannot create object of abstract class 
		
//		Sandwich obj=new Sandwich();
		
		
		CheseCornSandwich s=new CheseCornSandwich();
		s.prepare();
		s.prepare(10);
	}
	

}
