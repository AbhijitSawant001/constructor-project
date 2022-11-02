package constructor_with_parameter;

public class sample9 

{
		int num3;
		int num4;
		
		sample9(int a, int b)
		{
			num3=a;
			num4=b;
			
		}
		
		public void addition()
		{
			System.out.println("ADDITION=  "+(num3+num4));
			
		}
		public static void main(String[] args) {
			
			sample9 add=new sample9(45, 30);
			add.addition();
		}
}
