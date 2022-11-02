package constructor_with_parameter;


public class sample11
{
	int x;
	
	
	sample11(int side)
	{
		x=side;
		
	}
	public void areaOfSquare()
	{
	System.out.println("AREA OFF SQUARE= "+ (x*x));
	
	}
	public static void main(String[] args) {
		
		sample11 area=new sample11(20);
		area.areaOfSquare();
	}
}
