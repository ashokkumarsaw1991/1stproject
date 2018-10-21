package QspiderTest;

public class Demo6 {

	public static void main(String[] args) {
		
		String s="failure is the pillar of success";
		StringBuffer sb=new StringBuffer();
		for(int i=s.length()-1;i>=0;i--)
		{
			char ch=s.charAt(i);
			sb.append(ch);
		}
		System.out.println(sb.toString());
	}

}
