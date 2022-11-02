package constructor_with_parameter;

public class sample8 
{
	int a;
	int b;
	sample8(int c, int d)
	{
		a=c;
		b=d;
		
	}
	
	public void sub() 
	{
		System.out.println("substraction= "+(a-b));
		
	}
	public static void main(String[] args) {
		sample8 sub1=new sample8(330, 555);
		sub1.sub();
	}
	}
