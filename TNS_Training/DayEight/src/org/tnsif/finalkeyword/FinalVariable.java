package org.tnsif.finalkeyword;
public class FinalVariable {

	// Need to 

	final static int rollNo=92;
	
	public static void diplay()
	{
		// we can't reinitialize final variable 
//		rollNo=121;  
		System.out.print(rollNo);
	}
	public static void main(String args[])
	{
		FinalVariable.diplay();
	}
	
}
