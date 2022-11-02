package constructor_package;

public class sample15
{
	
	final float PI;
	int radius;
	
	sample15()
	{
		PI=3.14f;
		radius=5;
	}
	
	public void circle()
	{
		System.out.println("area of circle= "+(PI*radius*radius));
	}
	
	public static void main(String[] args) {
		
		sample15 area=new sample15();
		area.circle();
		
	}
}

