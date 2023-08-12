package org.tnsif.polymorphism;
class CM
{
	static long amount=12332313;
	static void CorruptAmount()
	{
		System.out.println(amount);
	}
}
class MLA extends CM
{
	static long amount=121112313;
	static void CorruptAmount()
	{
		CM.CorruptAmount();
		System.out.println(amount);
	}
}
public class CorruptionLeader {

	public static void main(String[] args) {
		MLA.CorruptAmount();
	}

}
