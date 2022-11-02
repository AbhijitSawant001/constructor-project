package static_nonStatic_variables;

public class sample3 
{
	public static void main(String[] args) {
		
		sample2 s1=new sample2();
		s1.name="ABHIJIT SAWANT";
		s1.rollNo=21;
		sample2.principalName="Mr JADHAV";
		
		sample2 s2=new sample2();
		
		s2.name="OMKAR";
		s2.rollNo=22;
		sample2.principalName="Mr. SAWANT";
		
		
		
		
		s1.studentInfo();
		s2.studentInfo();
		
		
	}
}
