package QspiderTest;

public class Capegemini3 {

	public static void main(String[] args) {
	//	 System.out.println(reverse(123456));	
	/*	String num1=Integer.toString(num);
		System.out.println(num1.length());
		  String num2=new StringBuffer(num1).reverse().toString();
		  System.out.println(Integer.parseInt(num2));
		  System.out.println(1+2+3+4+5+6);*/
		
		 String Str1="Hello";
		 String Str2="World";
		 System.out.println("Str1="+Str1 + " " +"Str2="+Str2);
		 String Temp="";
		 Temp=Str1;
		 Str1=Str2;
		 Str2=Temp;
		 System.out.println("Str1="+Str1 + " " +"Str2="+Str2);
		
	}
	
	/*public static int reverse(int i)
	{
		int reverse=0;
		while(i>0)
		{
			
			
		
		int remainder=i%10;
		 reverse=reverse*10+remainder;
		 i=i/10;
		}
		
		return reverse;
	}*/

}
