package constructor_package;

public class sample2 

{
   //user define constructor
	
	//step1: declaration of global variable
	int num1;   //10
	int num2;    //20
	
	//step2: global variable initialization
	//user defined constructor  --> provided by user
	//use1: initialize global variable
	//use2: copy all the members of class into object
	sample2()
	{
		num1=10;
		num2=20;		
	}
	
	//usage
	public void addition()
	{
		System.out.println("ADDITION = "+(num1+num2));
	}
	
	public void multiplication()
	{
		System.out.println("MULTIPICATION = "+(num1*num2));
	}
	
	public static void main(String[] args) {
				
		sample2 s2=new sample2();
		s2.addition();
		s2.multiplication();
		
		System.out.println("------");
		
		sample3 s3=new sample3();
		s3.sub();
	}
	
}
	
	
	

