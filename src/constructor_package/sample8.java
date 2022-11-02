package constructor_package;

public class sample8 

{
	float num1;
	float num2;
	
	sample8()
	{
		num1=3.35f;
		num2=10;
		
	}
	
	public void multilpication()
	{
		System.out.println(num1*num2);
	}
	
	public static void main(String[] args) {
		
		sample8 mul=new sample8();
		mul.multilpication();
	}
}
