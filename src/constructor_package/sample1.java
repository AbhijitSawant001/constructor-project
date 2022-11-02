package constructor_package;

public class sample1 

{
	int a;
	int b;							//global variable declaration
	
	sample1()						//constructor
	{
		a=20;						//variable initialization
		b=30;
	}
	
	public void m1() 				//calling global variable in non static method
	{
		System.out.println(a+b);
	}
	
	
	public static void main(String[] args) 
	
	{
			
		sample1 s1=new sample1();	//object creation for non static method
		s1.m1();					//calling non static method objectName.className()
			
	}
		
		
}
