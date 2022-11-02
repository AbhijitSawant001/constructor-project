package constructor_overloading;

public class sample10 
{
	int num3;
	int num4;
	
	sample10()
	{
		num3=123;
		num4=456;
	}
	sample10(int a ,int b)
	{
		num3=a;
		num4=b;
	}
	public void substraction()
	{
		System.out.println("SUBSTRACTION= " +(num4+num3));
	}
	public static void main(String[] args) {
		sample10 s10=new sample10();
		s10.substraction();
		sample10 s11=new sample10(10, 3);
		s11.substraction();
	}
	
}
