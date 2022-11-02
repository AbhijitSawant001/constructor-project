package constructor_package;

public class sample7 

{
	int num4;
	int num5;
	
	sample7()
	{
		num4=330;
		num5=26;
		
	}
	public void addition()
	{
		System.out.println(num4+num5);
		
	}
	
	public static void main(String[] args) {
		
		sample7 add=new sample7();
		add.addition();
	}
}
