package constructor_with_parameter;

public class sample2 
{
		int num4;
		int num5;
		
		sample2(int x, int y)
		{
			num4=x;
			num5=y;
			
		}
		
		public void substraction()
		{
			System.out.println("SUBSTRACTION= "+(num4-num5));
			
		}
		public static void main(String[] args) {
			sample2 sub=new sample2(60, 30);
			sub.substraction();
			
		}
}

