package org.tsnif.interfacedemo;

public class MultipleInheritance  implements ColdDrink ,AlcoholicDrink{
public static void main(String[] args) {
	MultipleInheritance obj=new MultipleInheritance();
	System.out.println(AlcoholicDrink.alcoholDrink);
	System.out.println(ColdDrink.coldDrink);
}
}
