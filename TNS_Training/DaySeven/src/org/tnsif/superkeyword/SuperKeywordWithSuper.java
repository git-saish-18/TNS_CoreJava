package org.tnsif.superkeyword;

class Google
{
	public String ceo="sunder pichai";
	Google()
	{
		
		System.out.println(ceo);
	}
	
	Google(String name)
	{
		
		this.ceo=name;
		System.out.println(ceo);
	}

	
}
class Gmail extends Google
{
	public String ceo="John mike";
	Gmail()
	{
		System.out.println(ceo);
	}
	Gmail(String name,String ceo)
	{
		
		super(name);
		this.ceo=ceo;
		System.out.println(ceo);
	}

}
public class SuperKeywordWithSuper {

	public static void main(String[] args) {
//		Gmail g=new Gmail();
		
		Gmail g=new Gmail("GoogleCeo","GmailCeo");
		
		

	}

}
