package constructor_with_parameter;

public class sample5 
{
		int num7;
		int num8;
		int num9;
		
		sample5(int a,int b,int c)
		{
			num7=a;
			num8=b;
			num9=c;
			
		}
		public void addition()
		{
			System.out.println("ADDITION= "+(num7+num8+num9));
		}
		public static void main(String[] args) {
			
			sample5 add=new sample5(10, 20, 30);
			add.addition();
			
		}
		
}
