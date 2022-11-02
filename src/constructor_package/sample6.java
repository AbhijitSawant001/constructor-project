package constructor_package;

public class sample6 
{
		int h;
		int i;
		
		sample6()
		{
			h=40;
			i=50;
			
		}
		public void m6() 
		{
			System.out.println(h+i+i);
			
		}
		public static void main(String[] args) {
			
			sample6 s6=new sample6();
			s6.m6();
		}
}
