package constructor_with_parameter;

public class sample3 

{
	int a;
	int b;
	sample3(int num4, int num5)
	{
		a=num4;
		b=num5;
		
	}
	public void multiplication() 
	{
		System.out.println("MULTIPLICATION= "+(a*b));
		
	}
	public static void main(String[] args)
	{
		sample3 mul=new sample3(12, 14);
		mul.multiplication();
		
	}
}
