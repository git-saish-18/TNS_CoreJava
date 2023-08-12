package throwandthrows;

public class LoginCredentials extends Exception {

	private String str;
	
	
	LoginCredentials(String str)
	{
		super();
		this.str=str;
	}
	public String getstr()
	{
		return "I am Exception "+str;
	}
	
	public String toString()
	{
		return str;
		
	}
}
