package QspiderTest;

public class Demo4 {

	public static void main(String[] args) {
		 int n = 5, i, j, z = 1;
	  
	        z = n - 1;
	        for (j = 1; j <= n; j++) 
	        {
	            for (i = 1; i <= z; i++) 
	            {
	                System.out.print(" ");
	            }
	            z--;
	            for (i = 1; i <= 2 * j - 1; i++) 
	            {
	                System.out.print("*");                
	            }
	            System.out.println("");
	        }
	        z = 1;
	        for (j = 1; j <= n - 1; j++) 
	        {
	            for (i = 1; i <= z; i++) 
	            {
	                System.out.print(" ");
	            }
	            z++;
	            for (i = 1; i <= 2 * (n - j) - 1; i++) 
	            {
	                System.out.print("*");
	            }
	            System.out.println("");
	        }
	}

}
