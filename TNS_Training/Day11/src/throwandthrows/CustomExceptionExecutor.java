package throwandthrows;

import java.util.Scanner;

public class CustomExceptionExecutor {

	public static void main(String[] args)  {
		Scanner get=new Scanner(System.in);
		String userid=get.nextLine();
		String pass=get.nextLine();
		
		LoginCredentials s=new LoginCredentials(userid);
		
		try
		{
			if(userid.equals("saish") && pass.equals("saish@123"))
			{
				
				
				System.out.println("login success");
			}
			else
			{
				throw new LoginCredentials("Invalid Credentials");
			}
			
		}
		catch(LoginCredentials s1) {
			System.out.println(s1.getstr());
		}
		

	}

}
