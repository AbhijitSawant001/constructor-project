package constructor_overloading;

public class sample5 
{
	int abc;
	int xyz;
	
	
	sample5()
	{
		abc=400;
		xyz=150;
		
	}
	sample5(int a, int b)
	{
		abc=a;
		xyz=b;
		
	}
	public void name() 
	{
		System.out.println("SUBSTRACTION= "+(abc-xyz));
	}
	public static void main(String[] args) {
		
		sample5 s5=new sample5();
		s5.name();
		sample5 s6=new sample5(300, 150);
		s6.name();
				
	}
}
