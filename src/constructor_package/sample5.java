package constructor_package;

public class sample5 

{									//DIVISION
  int x;
  int y;
  
  sample5()
  {
	  x=30;
	  y=5;
	  
  }
  
  
  public void m5()
  {
	System.out.println(x/y);
  }
  
  public static void main(String[] args) {
	
	  sample5 s5=new sample5();
	  s5.m5();
}
}
