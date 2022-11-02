package constructor_with_parameter;

public class sample10 

{
	int a;
	int b;
	
	
	sample10(int height, int width)
	{
		a=height;
		b=width;
		
	}
	
	public void area()
	{
		System.out.println("AREA OF RECTANGLE= "+(a*b)+" cmsq");
		
	}
	public static void main(String[] args) {
		
		sample10 a1=new sample10(15, 20);
		a1.area();
	}
}
