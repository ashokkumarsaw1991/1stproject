package QspiderTest;

public class Demo7 {

	public static void main(String[] args) {
	 String str="Selenium";
	 char[] arr=str.toCharArray();
	 StringBuffer sb=new StringBuffer();
	 for(int i=0;i<=arr.length-1;i++)
	 {
		 char ch=arr[i];
		sb.append(++ch);
		 
	 }
	 System.out.println(sb);
		
		
		/*String s="malayalam";
	System.out.println(s);
	String s1="";
	for(int i=s.length()-1;i>=0;i--)
		s1=s1+s.charAt(i);
	
	System.out.println(s1);
	if(s.equalsIgnoreCase(s1))
		System.out.println("its plaindrome");
	else
		System.out.println("it's not");*/

		
		
		
		
		
		
		
		/*public static int fact(int n) {
		
		if (n == 1) {
			return 1;
		}
		return  n*(fact(n - 1));

	}
*/
		
		/*	int[] arr={10,20,30,40,90};
		int highest=arr[0];
		int index=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>highest)
			{  
				highest=arr[i];
				index++;
			}
		}
		System.out.println(highest);
		*/

		/*
		 * int a=2; int b=5; int result=0; for(int i=0;i<5;i++) {
		 * result=result+a; } System.out.println(result);
		 */

		/*
		 * String str1 = " Hi how are you doing"; String str2 =
		 * "Hi how are you"; StringBuffer sb = new StringBuffer(); String str3[]
		 * = str1.split(" "); String str4[] = str2.split(" "); for (String word1
		 * : str3) { for (String word2 : str4) { if
		 * (word1.equalsIgnoreCase(word2)) { sb.append(word2);
		 * System.out.print(word1+" "); }
		 * 
		 * } }
		 */

		/*
		 * String str = "THis is cRAZy"; char ch; StringBuffer sb = new
		 * StringBuffer(); for (int i = 0; i <= str.length() - 1; i++) { ch =
		 * str.charAt(i); if (Character.isLetter(ch)) { if
		 * (Character.isUpperCase(ch)) { sb.append(Character.toLowerCase(ch)); }
		 * else { sb.append(Character.toUpperCase(ch)); } } else {
		 * sb.append(ch); } } System.out.println(sb.toString());
		 */

		/*
		 * int i; int j; boolean flag; for (j = 2; j <= 100; j++) { flag = true;
		 * 
		 * for (i = 2; i < j; i++) { if (j % i == 0) { flag = false; break; } }
		 * if (flag) { System.out.println(j + " "); } j++;
		 * 
		 * }
		 */

		/*
		 * String str = "today is a bright sunny day"; String[] words =
		 * str.split(" "); System.out.println(Arrays.toString(words)); String
		 * temp = ""; boolean flag = true; while (flag) { flag = false; for (int
		 * i = 0; i<words.length - 1; i++) { if (words[i].length() > words[i +
		 * 1].length()) { temp = words[i]; words[i] = words[i + 1]; words[i + 1]
		 * = temp; flag = false; } } }
		 * System.out.println(Arrays.toString(words));*/
		 
	}
}