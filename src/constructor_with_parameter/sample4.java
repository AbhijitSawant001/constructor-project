package constructor_with_parameter;

public class sample4 
{
		int num6;
		int num7;
		
		sample4(int a, int b)
		{
			num6=a;
			num7=b;
			
		}
		public void division() 
		{
			System.out.println("DIVISION= " +(num6/num7));
			
		}
		public static void main(String[] args) {
			sample4 div=new sample4(60, 15);
			div.division();
			
		}
}
