// program to demostrate on this keyword is used to refer current instance of the class 

package org.tnsif.instanceofdemo;

class Account
{	
	public static int myNum;
	public long accountNo;
	
	public void setData(Account a,long accountNo)
	{
		a.accountNo=accountNo;
	}
	
	public void display()
	{
		System.out.println(accountNo);
	}
}
public class ThisKeywordDemoOne {

	public static void main(String[] args) {
		Account a=new Account();
		Account b=new Account();
		a.setData(a,100);
		Account.myNum=100;
		a.display();
		b.setData(a,101);
		b.setData(b,101);
		b.display();
		a.display();


	}

}
