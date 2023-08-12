package org.tsnif.interfacedemo;

public class ISRO implements ChandrayaanThree {
	public void status()
	{
		System.out.println("My Function Interface");
	}
	public static void main(String[] args) {
		ISRO myobj=new ISRO();
		myobj.status();

	}

}
