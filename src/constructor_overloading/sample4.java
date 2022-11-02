package constructor_overloading;

public class sample4 
{
	int num3;
	int num4;
	
	sample4(int a, int b)
	{
		num3=a;
		num4=b;
		
	}
	
	sample4()
	{
		num3=200;
		
		num4=2;
	}
	
	sample4(int  x, int y, int z)
	{
		num3=x;
		num4=y;
	}
	public void div() 
	{
		System.out.println("DIVISION= "+(num3/num4));
	}
	
	public static void main(String[] args) {
		sample4 s4=new sample4();
		s4.div();
		sample4 s5=new sample4(10, 2, 0);
		s5.div();
		sample4 s6=new sample4(10, 5);
		s6.div();
	}
}
