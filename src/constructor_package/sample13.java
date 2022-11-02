package constructor_package;

public class sample13 

{
		int side;
		sample13()
		{
			side=20;
			
		}
		public void areaOfSquare() 
		{
				System.out.println("AREA OF SQUARE= "+(side*side));
		}
		public static void main(String[] args) {
			
			sample13 area=new sample13();
			area.areaOfSquare();
		}
}
