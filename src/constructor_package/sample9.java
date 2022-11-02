package constructor_package;

public class sample9

{
		int a;
		float b;
		
		sample9()
		{
			
			a=45;
			b=5.32f;
		
		}
		
		public void division()
		{
				System.out.println("division is");
				System.out.println(a/b);
				
		}
		
		public static void main(String[] args) {
			sample9 div=new sample9();
			div.division();
			sample10 sub=new sample10();
			sub.substraction();
			sample7 add=new sample7();
			add.addition();
			sample1 a1=new sample1();
			a1.m1();
		}
}
