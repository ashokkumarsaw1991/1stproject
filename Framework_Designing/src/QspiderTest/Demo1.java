package QspiderTest;

public class Demo1 {

	public static void main(String[] args) {
		String s="i love java and i love manual love  i love automation and i love money";
		int index=0;
		String srch="love";
		int count=0;
		int i=0;
		
		while((index=s.indexOf(srch,i))!=-1)
		{
			count++;
			i=index+srch.length();
		}
		System.out.println("The count of love in above String is = "+count);

	}

}
