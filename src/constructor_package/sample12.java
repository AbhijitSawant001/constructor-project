package constructor_package;

public class sample12 

{
		int height;
		int base;
		
		sample12()
		{
			height=39;
			base=40;
			
		}
		public void area() 
		{
			System.out.println("area of triangle="+(0.5*height*base));
			
		}
		
		public static void main(String[] args) {
			
			sample12 a1=new sample12();
			a1.area();
		}
}


