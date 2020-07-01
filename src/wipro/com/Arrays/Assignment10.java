package wipro.com.Arrays;

public class Assignment10
{
	  public static void main (String[] args) 
	    { 
	        int a[] = {2,3,2}; 
	  
	        int left = 0, right = a.length - 1; 
	        while (left < right) 
	        { 
	            while (a[left]%2 == 0 && left < right) 
	                left++; 
	            while (a[right]%2 == 1 && left < right) 
	                right--; 
	  
	            if (left < right) 
	            { 
	                int t = a[left]; 
	                a[left] = a[right]; 
	                a[right] = t; 
	                left++; 
	                right--; 
	            } 
	        } 
	 
	        for (int i = 0; i < a.length; i++) 
	            System.out.print(a[i]+" "); 
	    } 
}
