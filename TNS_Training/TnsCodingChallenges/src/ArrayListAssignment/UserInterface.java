package ArrayListAssignment;

import java.util.Scanner;

public class UserInterface  {


	public static void main(String[] args) {
		Products obj=new Products();
	  int choice=0;
	  Scanner cin=new Scanner(System.in);
	 
	  while(choice!=3)
	  {
		  System.out.println("enter the choice 1.Add 2.Display 3.Exit");
		  choice=cin.nextInt();
		  
	  switch(choice)
	  {
	  case 1:
		  System.out.println("Enter the product name ");
		  String prodecuName=cin.next();
		  obj.addProductToList(prodecuName);
		  break;
	  case 2:
		  if(obj.productList.size()==0)
		  {
			  System.out.println("list is empty\n");
		  }
		  else
		  {
			  obj.display();
		  }
		  break;
	  case 3: System.out.println("happy Ending....");
	  break;
	  default :System.out.println("Invalid choice");
	  break;
	  }
	  
	  }

	}

}
