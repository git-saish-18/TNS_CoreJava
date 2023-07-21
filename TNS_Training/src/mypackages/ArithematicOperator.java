package mypackages;
import java.util.*;
public class ArithematicOperator {

	public static void main(String[] args) {
		
		Scanner get=new Scanner(System.in);
		System.out.println(" Enter the Number ");
		int num1=get.nextInt();
		int num2=get.nextInt();
		System.out.println("Addition of Two number "+(num1+num2));
		System.out.println("Substraction of Two number "+(num1-num2));
		System.out.println("Multiplication of Two number "+(num1*num2));
		System.out.println("Division of Two number "+(num1/num2));
		System.out.println("Remainder of Two number "+(num1%num2));
	}

}
