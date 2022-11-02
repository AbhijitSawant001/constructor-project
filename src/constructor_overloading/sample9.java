package constructor_overloading;

public class sample9 
{
	int num4;
	int num5;
	sample9()
	{
		num4=1152;
		num5=845;
		
	}
	sample9(int a, int b)
	{
		num4=a;
		num5=b;
		
	}
	public void div() 
	{
		double d= (num4/num5);
		System.out.println("division= "+d);
	}
	public static void main(String[] args) {
		
		sample9 s9=new  sample9();
		s9.div();
		sample9 s10=new sample9(122, 22);
		s10.div();
	}
}
