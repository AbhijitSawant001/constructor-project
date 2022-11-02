package constructor_overloading;

public class sample8 
{
	int num1;
	int num2;
	
	sample8()
	{
		num1=877;
		num2=787;
	}
	sample8(int x, int y)
	{
		num1=x;
		num2=y;
	}
	public void sub()
	{
		System.out.println("SUBSTRACTION= "+(num1-num2));
	}
	public static void main(String[] args) {
		sample8 s8=new sample8();
		s8.sub();
		sample8 s9=new sample8(15555, 5665);
		s9.sub();
	}
}
