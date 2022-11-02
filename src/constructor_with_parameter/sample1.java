package constructor_with_parameter;

public class sample1
{
	int num1;
	int num2;
	sample1(int a, int b)
	{
		num1=a;
		num2=b;
	}
	
	public void addition()
	{
		System.out.println("ADDITION= "+(num1+num2));
		
		
	}
	public static void main(String[] args) {
		
		sample1 add=new sample1(10,20);
		add.addition();
		sample1 add2=new sample1(20,522);
		add2.addition();
		 
	}
		

}
		