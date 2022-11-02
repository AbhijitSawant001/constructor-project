package constructor_overloading;

public class sample6 
{
	int num1;
	int num2;
	
	sample6()
	{
		num1=1010;
		num2=2432;
		
	}
	public void addition()
	{
		System.out.println("ADDITION= "+(num1+num2));
		
	}
	sample6(int a,int b)
	{
		num1=a;
		num2=b;
		
	}
	public static void main(String[] args) {
		sample6 s6=new sample6();
		s6.addition();
		sample6 s7=new sample6(152, 252);
		s7.addition();
		sample5 s8=new sample5(300, 150);
		s8.name();
	}
}
