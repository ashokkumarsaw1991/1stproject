package QspiderTest;



public class Demo9 {

	public static void main(String[] args) {
	//Demo10 d= new Demo10();
    // d.getClass().getName();
     //System.out.println(d);
		Demo10 d=Demo10.getDemo10();
		Demo10 d4=Demo10.getDemo10();
	}

}

class Demo10
{
	static private Demo10 d3;
	private Demo10()
	{
		
	}
	
	static Demo10 getDemo10()
	{
		if(d3==null)
		{
			d3=new Demo10();
		}
		
		//Demo10 d2= new Demo10();
		return d3;
	}
}