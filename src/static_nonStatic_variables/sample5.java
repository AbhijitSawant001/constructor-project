package static_nonStatic_variables;

public class sample5 
{
	public static void main(String[] args)
	{
		
		
		sample4 s4=new sample4();
		s4.name="ABHIJIT SAWANT";
		s4.mobileNo=9545978767l;
		sample4.address="PUNE";
		sample6 s6= new sample6();
		s6.collegeName="ACEM";
		s6.marks=80;
		sample6.department="ELECTRICAL ENGINEERING";
		
		
		
		
		sample4 s5=new sample4();
		s5.name="OMKAR PANASKAR";
		s5.mobileNo=9044555552l;
		sample4.address="NATEPUTE";
		sample6 s7=new sample6();
		s7.collegeName="ACEM";
		s7.marks=90;
		sample6.department="ELECTRICAL ENGINEERING";
		
		
		s4.personalInfo();
		s6.collegeInfo();
		s5.personalInfo();
		s7.collegeInfo();
				
	}
}
