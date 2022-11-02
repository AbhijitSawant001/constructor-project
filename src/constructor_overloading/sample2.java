package constructor_overloading;


public class sample2
{
	int a;
	int b;
	sample2()
	{
		a=23;
		b=32;
		
	}
	public void addition() 
	{
		System.out.println("ADDITION= "+(a+b));
		
	}
	sample2(int c, int d)
	{
		a=c;
		b=d;
		
	}
	public static void main(String[] args) 
	{
		sample2 s1=new sample2();
		s1.addition();
		sample2 s2=new sample2(50, 220);
		s2.addition();
				
	}
	
}
