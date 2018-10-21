package QspiderTest;

import java.util.Arrays;

public class Demo3 {

	public static void main(String[] args) {
		String s="failure is the pillar of success";
	
		System.out.println("Before reversing.....");
		System.out.println(s);
		StringBuffer sb=new StringBuffer(s);
		StringBuffer sb1=sb.reverse();
		String s1=sb1.toString();
		System.out.println("After reversing.....");
		System.out.println(s1);
		
			}

}
