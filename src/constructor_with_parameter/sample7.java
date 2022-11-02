package constructor_with_parameter;

public class sample7 

{
	int num1;
	int num2;
	int num3; 
	int num4;
	
	sample7(int a,int b, int c, int d)
	{
		num1=a;
		num2=b;
		num3=c;
		num4=d;
		
	}
	public void addition()
	{
		System.out.println("ADDITION= "+(num1+num2+num3+num4));
		
	}
	public static void main(String[] args) {
		sample7 add=new sample7(10, 52, 320, 14);
		
		add.addition();
	}
}
