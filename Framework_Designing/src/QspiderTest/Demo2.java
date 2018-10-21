package QspiderTest;

public class Demo2 {

	public static void main(String[] args) {
		int temp =0;
		int n=1634;
		int r=0;
		int sum=0;
		temp=n;
		while(temp>0)
		{
			r=temp%10;
			sum=sum+r*r*r;
			temp=temp/10;
		}
		if(n==sum)
			System.out.println("the number is armstrong "+sum);
		else
			System.out.println("the number is not  armstrong "+sum);

	}

}
