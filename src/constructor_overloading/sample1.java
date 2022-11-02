package constructor_overloading;

public class sample1 
{
	int num1;
	int num2;
	
	
	//without parameter constructor
    sample1()
	{
		num1=10;
		num2=20;
	}
	
	
	//with int,int parameter constructor
	sample1(int a, int b)  //5,6
	{
		num1=a;    //5
		num2=b;    //6
	}
	
	
	public void addition()
	{
		System.out.println(num1+num2);
	}
	
	
	
	
	public static void main(String[] args) {
		
		
		sample1 s7=new sample1(20, 30);
		s7.addition();     //11
		
		
		sample1 s8=new sample1();
		s8.addition();     //30
		
		
		
		
	}
}
