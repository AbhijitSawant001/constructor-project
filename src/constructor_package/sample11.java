package constructor_package;

public class sample11 

{
		int i;
		int j;
		
		sample11()
		{
			i=200;
			j=400;
			
		}
		
		public void remainder() 
		{
			System.out.println("remainder= "+(j%i));
			System.out.println("division= "+(j/i));
		}
		public static void main(String[] args) {
			
			sample11 rem=new sample11();
			rem.remainder();
		}
}
