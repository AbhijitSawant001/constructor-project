package constructor_package;

public class sample4 

{									//ADDITION USING CONSTRUCTOR AND NON STATIC GLOBAL VARIABLE
		int num1;
		int num2;
		
		sample4()
		{
			num1=200;
			num2=400;
			
		}
		
		public void m3()
		{
			System.out.println(num1+num2);
		}
		
		
		
		public void m4() 						//subtraction
		{
				System.out.println(num2-num1);
		}
		
		public static void main(String[] args) {
			
			sample4 s4= new sample4();
			s4.m3();
			s4.m4();
		}
}
