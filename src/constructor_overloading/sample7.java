package constructor_overloading;

public class sample7

{
	int num6;
	int num7;
	sample7()
	{
		num6=5255;
		num7=5454;
	}
	sample7(int a,int b)
	{
		num6=a;
		num7=b;
		
	}
	public void multiplication()
	{
		System.out.println("MULTIPLICATION= "+(num6*num7));
		
	}
	public static void main(String[] args) {
		
		sample7 s7=new  sample7();
		s7.multiplication();
		sample7 s8=new sample7(51, 5);
		s8.multiplication();
	}
}
