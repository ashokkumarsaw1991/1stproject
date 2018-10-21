package QspiderTest;

public class Demo8 {

	public static void main(String[] args) {
   int n=5;
   for(int i=0;i<n;i++)
   {
	   for(int j=n-1;j>=i;j--)
	   {
		   System.out.print(" ");
	   }
	   for(int k=0;k<=i;k++)
	   {
		   System.out.print("*");
	   }
	   System.out.println("");
   }
   
   for(int i=n-1;i>=1;i--)
   {
	   for(int j=n-1;j>=i;j--)
	   {
		   System.out.print(" ");
	   }
	   for(int k=i;k>=1;k++)
	   {
		 System.out.print("*");  
	   }
	   System.out.println("");
   }
		
	}

}
