package constructor_with_parameter;

public class sample14 
{
		int num1;
		int num2;
		
		sample14(int a, int b)
		{
			
			num1=a;
			num2=b;
		}
		
		public void div() 
		
		
		{
			System.out.println(num1/num2);
		}
		public static void main(String[] args) {
			sample14 d1=new sample14(15, 5);
			d1.div();
			
		}
}
