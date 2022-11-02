package constructor_overloading;

public class sample3 
{
	int num1;
	int num2;
	
	sample3()
	{
		num1=20;
		num2=200;
		
	}
	
	public void mul() 
	{
		System.out.println("MULTIPLICATION= "+(num1*num2));
		
		
	}
	sample3(int x,int y)
	{
		num1=x;
		num2=y;
	}
	public static void main(String[] args) {
		
		
		sample3 s3=new sample3();
		s3.mul();
		sample3 s4=new sample3(10, 12);
		s4.mul();
	}
}
