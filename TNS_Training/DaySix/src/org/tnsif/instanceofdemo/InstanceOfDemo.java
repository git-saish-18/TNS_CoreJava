package org.tnsif.instanceofdemo;

class RBI
{
	protected String ifscCode="RBI8414";
}
 class SBI extends RBI
{
	 
	 String ifscCode="SBI14552";
	 public void show()
	 {
		 
		 System.out.println(super.ifscCode);
	 }
}
public class InstanceOfDemo {

	public static void main(String[] args) {
		SBI bank=new SBI();
	    System.out.println(bank.ifscCode);
	    bank.show();
	    System.out.println(bank instanceof SBI);
	    
	    System.out.println(bank instanceof RBI);
	    
	    InstanceOfDemo myobj=new InstanceOfDemo();
	    
//	    System.out.println(myobj instanceof SBI);
	  
	}

}
