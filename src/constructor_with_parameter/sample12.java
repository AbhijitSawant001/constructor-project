package constructor_with_parameter;

public class sample12
{
	int a;
	int b;
	sample12(int height, int base)
	{
		a=height;
		b=base;
		
	}
	public void triangle() 
	{
		System.out.println("AREA OF TRIANGLE= "+(0.5*a*b));
	}
	
	public static void main(String[] args) {
		sample12 area=new sample12(15, 3);
		area.triangle();
	}
}
