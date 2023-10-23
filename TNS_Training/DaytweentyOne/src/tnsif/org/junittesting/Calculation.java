package tnsif.org.junittesting;

public class Calculation {
	 public static int findMax(int arr[]){  
	        int max=Integer.MIN_VALUE;  
	        for(int i=1;i<arr.length;i++){  
	            if(max<arr[i])  
	                max=arr[i];  
	        }  
	        return max;  
	    }  
	 
	 public static int fact(int num)
	 {
		 int fact=1;
		 for(int i=1;i<=num;i++)
		 {
			 fact*=i;
		 }
		 return fact;
		
	 }
	 public static boolean isprime(int num)
	 {
		 if(num<2)
		 {
			 return true;
		 }
		 for(int i=2;i<=num/2;i++)
		 {
			 if(num%i==0)
			 {
				 return false;
			 }
			 else
			 {
				 return true;
			 }
		 }
		
		 return false;
	 }
}
