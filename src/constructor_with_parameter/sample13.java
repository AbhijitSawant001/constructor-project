package constructor_with_parameter;

public class sample13 

{
	int res1;
	int res2;
	
	sample13(int a, int b)
	{
		res1=a;
		res2=b;
		
	}
	
	public void seriesRes() 
	{
		System.out.println("RESISTANCE IN SERIES= " +(res1+res2));
		
	}
	public static void main(String[] args) {
		sample13 res=new sample13(115, 1225);
		res.seriesRes();
	}
}
