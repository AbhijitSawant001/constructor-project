package constructor_package;

public class sample14 
{
	int length;
	int width;
	
	sample14()
	{
		length=12;
		width=14;
		
	}
	public void rectangel() 
	
	{
		System.out.println("AREA OF RECTANGLE= " +(length*width));
		
	}
	public static void main(String[] args) {
		sample14 area=new sample14();
		area.rectangel();
		
		
	}
}
