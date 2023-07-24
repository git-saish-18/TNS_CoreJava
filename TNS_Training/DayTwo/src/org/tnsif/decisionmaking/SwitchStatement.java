package org.tnsif.decisionmaking;
import java.util.*;
public class SwitchStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner get=new Scanner(System.in);
System.out.println("1:Jay Shri Ram");
System.out.println("2:Kaun Tujhe");
System.out.println("3:Jee karda");
System.out.println("4:Tum mile");

System.out.println("Enter the Song Number");
int songNo=get.nextInt();



switch(songNo)
{
case 1:System.out.println("Jay Shri Ram");
break;
case 2:System.out.println("Kaun Tujhe");
break;
case 3:System.out.println("Jee karda");
break;
case 4:System.out.println("Tum mile");
break;
default :System.out.println("Enter correct choice");
break;
}
	}

}
